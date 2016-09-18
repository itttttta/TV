requirejs(['jquery', 'tag'],
    function ($, tag) {
        var tagOpts = {
            tagArray: roles,
            choiceTagArray: choiceRoles
        };
        tag.init(tagOpts);

        $('#submit').click(function () {

            var choiceTagArray = [];
            $("#choice_tags").find(".tag").each(function (i, obj) {
                var id = $(obj).data('id');
                choiceTagArray.push(id);
            });

            $.ajax({
                url: ctx + "/manage/admin/save",
                data: {
                    id: $('#id').val(),
                    username: $('#username').val(),
                    name: $('#name').val(),
                    password: $('#password').val(),
                    locked: $('#locked').val(),
                    choiceRoleList: choiceTagArray
                },
                method: "post",
                dataType: "json",
                success: function (data) {
                    console.log(data.code);
                },
                error: function () {
                }
            });
        });
    });
