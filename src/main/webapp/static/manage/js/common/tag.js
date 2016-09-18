/**
 * Created by wangfei on 15/10/23.
 */


//tag 组件


define(['jquery'], function ($) {

    var options = {
        $choiceTags: '#choice_tags',
        $tags: '#tags',
        tagArray: [],
        choiceTagArray: []
    };

    var tpl = {
        tags: '<div class="tag"></div>',
        choice_tags: '<div class="tag"></div>'
    };

    var tags = tpl['tags'];

    var choiceTags = tpl['choice_tags'];

    var $choiceTags = $(options.$choiceTags);

    var $tags = $(options.$tags);


    function tagsBind() {
        for (var i = 0; i < options.tagArray.length; i++) {
            console.log(options.choiceTagArray);
            var tagsTpl = $(tags);
            var choiceTagsTpl = $(choiceTags);
            var tagHtml = tagsTpl.attr('data-id', options.tagArray[i].id).text(options.tagArray[i].name);
            var choiceTagHtml = choiceTagsTpl.attr('data-id', options.tagArray[i].id).text(options.tagArray[i].name);
            if (0 <= options.choiceTagArray.indexOf(options.tagArray[i].id)) {
                $choiceTags.append(choiceTagHtml)
            } else {
                $tags.append(tagHtml)
            }
        }
    }


    function run() {

        $choiceTags.on('click', '.tag', function () {
            $tags.append(this);
        });
        $tags.on('click', '.tag', function () {
            $choiceTags.append(this);
        });
    }

    function init(opts) {
        if (opts) {
            $.fn.extend(options, opts);
        }
        tagsBind();
        //choiceTagsBind();
        run();

    }

    return {
        init: function (opts) {
            init(opts);
        }
    };

});