/**
 * Created by wangfei on 15/10/25.
 */
requirejs.config({
    //By default load any module IDs from js/lib
    baseUrl: ctx + '/static',
    //except, if the module ID starts with "app",
    //load it from the js/app directory. paths
    //config is relative to the baseUrl, and
    //never includes a ".js" extension since
    //the paths config could be for a directory.
    shim: {
     'jquery.validationEngine': ['jquery'],
     'jquery.validationEngine-zh_CN': ['jquery.validationEngine']
     },


    paths: {
        "jquery": "manage/js/jquery/jquery-1.11.3.min",
        "tag": "manage/js/common/tag"
    }
});