package com.yfzm.whoissly;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpyWord {

    private static Random random = new Random();

    public static List<String> getWords() {
        List<String> chosenWords = new ArrayList<>();
        int pairNum = random.nextInt(allWords.length) / 2;
        int bonus = random.nextInt(2);
        chosenWords.add(allWords[pairNum * 2 + bonus]);
        chosenWords.add(allWords[pairNum * 2 + 1 - bonus]);
        return chosenWords;
    }  
    
    private static String[] allWords = {
            "包青天","狄仁杰",
            "薰衣草","满天星",
            "甄子丹","李连杰",
            "男朋友","前男友",
            "菠萝蜜","榴莲",
            "孟非","乐嘉",
            "麦克风","扩音器",
            "双胞胎","龙凤胎",
            "鼠目寸光","井底之蛙",
            "口香糖","木糖醇",
            "辣椒","芥末",
            "富二代","高富帅",
            "唇膏","口红",
            "晨光","真彩",
            "大白兔","金丝猴",
            "那英","韩红",
            "谢娜张杰","邓超孙俪",
            "面包","蛋糕",
            "婚纱","喜服",
            "鱼香肉丝","四喜丸子",
            "生活费","零花钱",
            "纸巾","手帕",
            "白菜","生菜",
            "洗衣粉","皂角粉",
            "甄?传","红楼梦",
            "小沈阳","宋小宝",
            "董永","许仙",
            "新年","跨年",
            "贵妃醉酒","黛玉葬花",
            "果粒橙","鲜橙多",
            "手机","座机",
            "丑小鸭","灰姑娘",
            "蜘蛛侠","蝙蝠侠",
            "赵敏","黄蓉",
            "橙子","橘子",
            "魔术师","魔法师",
            "海豚","海狮",
            "十面埋伏","四面楚歌",
            "吉他","琵琶",
            "金庸","古龙",
            "作文","论文",
            "语无伦次","词不达意",
            "剩女","御姐",
            "豆浆","牛奶",
            "森马","以纯",
            "玫瑰","月季",
            "同学","同桌",
            "结婚","订婚",
            "气泡","水泡",
            "动物","植物",
            "情人节","光棍节",
            "张韶涵","王心凌",
            "泡泡糖","棒棒糖",
            "饼干","薯片",
            "玻璃","镜子",
            "风扇","空调",
            "电脑","ipad",
            "自行车","电动车",
            "班主任","辅导员",
            "小品","话剧",
            "鸭舌帽","遮阳帽",
            "童话","神话",
            "刘诗诗","刘亦菲",
            "奖牌","金牌",
            "橙子","橘子",
            "铁观音","碧螺春",
            "过山车","碰碰车",
            "若曦","晴川",
            "唇膏","口红",
            "壁纸","贴画",
            "纸巾","湿巾",
            "水盆","水桶",
            "小笼包","灌汤包",
            "杭州","苏州",
            "老佛爷","老天爷",
            "首尔","东京",
            "胡子","眉毛",
            "流星花园","花样男子",
            "太监","人妖",
            "蝴蝶","蜜蜂",
            "图书馆","图书店",
            "牛肉干","猪肉脯",
            "勇往直前","全力以赴",
            "葡萄","提子",
            "油条","麻花",
            "香港","台湾",
            "洗发露","护发素",
            "沐浴露","沐浴盐",
            "枕头","抱枕",
            "郭德纲","周立波",
            "作家","编剧",
            "壁纸","贴画",
            "丑小鸭","灰姑娘",
            "天天向上","非诚勿扰",
            "酸菜鱼","水煮鱼",
            "被子","床单",
            "裸婚","闪婚",
            "烤肉","涮肉",
            "公交","地铁",
            "包子","饺子",
            "土豆粉","酸辣粉",
            "福尔摩斯","工藤新一",
            "谢娜","李湘",
            "美人心计","倾世皇妃",
            "神雕侠侣","天龙八部",
            "孟飞","乐嘉",
            "近视眼镜","隐形眼镜",
            "保安","保镖",
            "警察","捕快",
            "成吉思汗","努尔哈赤",
            "牛奶","豆浆",
            "白菜","生菜",
            "皇帝","太子",
            "饺子","包子",
            "降龙十八掌","九阴白骨爪",
            "绿茶","苦茶",
            "蝴蝶","飞蛾",
            "梁山伯与祝英台","罗密欧与朱丽叶",
            "辣椒","芥末",
            "红烧牛肉面","香辣牛肉面",
            "盒子","箱子",
            "近视眼镜","隐形眼镜",
            "公交","地铁",
            "过山车","碰碰车",
            "蝴蝶","蜜蜂",
            "果粒橙","鲜橙多",
            "夏家三千金","爱情睡醒了",
            "裸婚","闪婚",
            "龙凤呈祥","鸳鸯戏水",
            "钢笔","中性笔",
            "楼梯","电梯",
            "反弹琵琶","乱弹棉花",
            "两小无猜","青梅竹马",
            "妈妈","娘",
            "班主任","辅导员",
            "高跟鞋","增高鞋",
            "鹅毛","鸡毛",
            "老佛爷","老天爷",
            "何炅","李维嘉",
            "吉他","琵琶",
            "麻婆豆腐","皮蛋豆腐",
            "干洗机","甩干机",
            "鸡蛋","鸭蛋",
            "金丝猴","大白兔奶糖",
            "包青天","狄仁杰",
            "结婚","订婚",
            "脚踏车","自行车",
            "贵妃醉酒","黛玉葬花",
            "江南style","最炫民族风",
            "郭德纲","周立波",
            "江南style","最炫民族风",
            "宫锁心玉","宫锁珠帘",
            "烤肉","涮肉",
            "端午节","中秋节",
            "奖牌","金牌",
            "卷发","直发",
            "海豚","海狮",
            "福尔摩斯","柯南",
            "哈密瓜","西瓜",
            "冠军","第一",
            "饭桶","饭碗",
            "降龙十八掌","九阴白骨爪",
            "汉堡包","肉夹馍",
            "婚纱","喜服",
            "脸盆","水桶",
            "口香糖","木糖醇",
            "天天向上","非诚勿扰",
            "老佛爷","老天爷",
            "宫锁心玉","宫锁珠帘",
            "江南style","最炫民族风",
            "郭德纲","周立波",
            "麻婆豆腐","皮蛋豆腐",
            "口香糖","木糖醇",
            "近视眼镜","隐形眼镜",
            "脚踏车","自行车",
            "梁山伯与祝英台","罗密欧与朱丽叶",
            "十面埋伏","四面楚歌",
            "谢娜张杰","邓超孙俪",
            "龙凤呈祥","鸳鸯戏水",
            "鱼香肉丝","四喜丸子",
            "美人心计","倾世皇妃",
            "贵妃醉酒","黛玉葬花",
            "哈密瓜","西瓜",
            "何炅","李维嘉",
            "流星花园","花样男子",
            "降龙十八掌","九阴白骨爪",
            "神雕侠侣","天龙八部",
            "果粒橙","鲜橙多",
            "语无伦次","词不达意",
            "成吉思汗","努尔哈赤",
            "红烧牛肉面","香辣牛肉面",
            "海豚","海狮",
            "汉堡包","肉夹馍",
            "勇往直前","全力以赴",
            "近视眼镜","隐形眼镜",
            "金丝猴","大白兔奶糖",
            "冠军","第一",
            "鼠目寸光","井底之蛙",
            "夏家三千金","爱情睡醒了",
            "福尔摩斯","工藤新一",
            "江南style","最炫民族风",
            "降龙十八掌","九阴白骨爪",
            "两小无猜","青梅竹马",
            "福尔摩斯","柯南",
            "贵妃醉酒","黛玉葬花",
            "过山车","碰碰车",
            "手机","座机",
            "干洗机","甩干机",
            "牛奶","豆浆",
            "包子","饺子",
            "海豚","海狮",
            "楼梯","电梯",
            "蝴蝶","蜜蜂",
            "结婚","订婚",
            "过山车","碰碰车",
            "钢笔","中性笔",
            "纸巾","手帕",
            "奖牌","金牌",
            "鸡蛋","鸭蛋",
            "壁纸","贴画",
            "唇膏","口红",
            "纸巾","湿巾",
            "情人节","光棍节",
            "油条","麻花",
            "白菜","生菜",
            "若曦","晴川",
            "大白兔","金丝猴",
            "小品","话剧",
            "面包","蛋糕",
            "小笼包","灌汤包",
            "气泡","水泡",
            "董永","许仙",
            "葡萄","提子",
            "电脑","ipad",
            "沐浴露","沐浴盐",
            "作家","编剧",
            "蝴蝶","蜜蜂",
            "张韶涵","王心凌",
            "生活费","零花钱",
            "裸婚","闪婚",
            "饼干","薯片",
            "杭州","苏州",
            "脸盆","水桶",
            "甄子丹","李连杰",
            "玻璃","镜子",
            "孟非","乐嘉",
            "保安","保镖",
            "婚纱","喜服",
            "菠萝蜜","榴莲",
            "谢娜","李湘",
            "被子","床单",
            "富二代","高富帅",
            "盒子","箱子",
            "图书馆","图书店",
            "香港","台湾",
            "辣椒","芥末",
            "动物","植物",
            "土豆粉","酸辣粉",
            "新年","跨年",
            "壁纸","贴画",
            "果粒橙","鲜橙多",
            "森马","以纯",
            "奖牌","金牌",
            "薰衣草","满天星",
            "老佛爷","老天爷",
            "橙子","橘子",
            "金庸","古龙",
            "豆浆","牛奶",
            "吉他","琵琶",
            "白菜","生菜",
            "吉他","琵琶",
            "饭桶","饭碗",
            "辣椒","芥末",
            "裸婚","闪婚",
            "蝴蝶","飞蛾",
            "高跟鞋","增高鞋",
            "酸菜鱼","水煮鱼",
            "晨光","真彩",
            "小沈阳","宋小宝",
            "婚纱","喜服",
            "班主任","辅导员",
            "麦克风","扩音器",
            "包青天","狄仁杰",
            "公交","地铁",
            "铁观音","碧螺春",
            "洗发露","护发素",
            "绿茶","苦茶",
            "反弹琵琶","乱弹棉花",
            "甄嬛传","红楼梦",
            "班主任","辅导员",
            "风扇","空调",
            "那英","韩红",
            "警察","捕快",
            "剩女","御姐",
            "丑小鸭","灰姑娘",
            "胡子","眉毛",
            "饺子","包子",
            "妈妈","娘",
            "公交","地铁",
            "卷发","直发",
            "烤肉","涮肉",
            "鸭舌帽","遮阳帽",
            "男朋友","前男友",
            "孟飞","乐嘉",
            "枕头","抱枕",
            "泡泡糖","棒棒糖",
            "洗衣粉","皂角粉",
            "童话","神话",
            "口香糖","木糖醇",
            "魔术师","魔法师",
            "端午节","中秋节",
            "赵敏","黄蓉",
            "包青天","狄仁杰",
            "唇膏","口红",
            "蜘蛛侠","蝙蝠侠",
            "结婚","订婚",
            "双胞胎","龙凤胎",
            "郭德纲","周立波",
            "自行车","电动车",
            "丑小鸭","灰姑娘",
            "皇帝","太子",
            "太监","人妖",
            "橙子","橘子",
            "鹅毛","鸡毛",
            "水盆","水桶",
            "烤肉","涮肉",
            "作文","论文",
            "牛肉干","猪肉脯",
            "刘诗诗","刘亦菲",
            "玫瑰","月季",
            "同学","同桌",
            "首尔","东京",
            "两小无猜","青梅竹马",
            "龙凤呈祥","鸳鸯戏水",
            "散文","小说",
            "好好学习","天天向上",
            "比喻","拟人",
            "移花接木","斗转星移",
            "专心致志","全神贯注",
            "一言不发","言多必失",
            "空气","氧气",
            "反射","折射",
            "定滑轮","动滑轮",
            "元素","原子",
            "日光灯","白炽灯",
            "马克斯","恩格斯",
            "黄继光","董存瑞",
            "关羽","张飞",
            "鉴真","玄奘",
            "一国两制","对外开放",
            "iphone","ipad",
            "铅球","铁饼",
            "足球","篮球",
            "乔丹","奥尼尔",
            "姚明","林书豪",
            "京东","凡客",
            "淘宝","当当",
            "YY","QQ",
            "CS","CF",
            "马尔代夫","普吉岛",
            "真菌","细菌",
            "晴川","若曦",
            "盗墓笔记","鬼吹灯",
            "范冰冰","李冰冰",
            "最炫民族风","江南style",
            "鲁豫","李静（杨澜）",
            "元芳","展昭",
            "赵本山","小沈阳",
            "鹿晗","kris",
            "北京爱情故事","乡村爱情故事",
            "百变大咖秀","快乐大本营",
            "橙子","橘子",
            "中国移动","中国联通",
            "统一卤肉面","统一老坛酸菜面",
            "钟","表",
            "酱油","醋",
            "玉米","高粱",
            "吸血鬼","僵尸",
            "菠萝蜜","榴莲",
            "瓜子","花生",
            "七喜","雪碧",
            "纸巾","手帕",
            "火车","地铁",
            "香奈儿","欧莱雅",
            "诺基亚","三星",
            "伊利","蒙牛",
            "美元","欧元",
            "牛肉干","猪肉脯",
            "鱼香肉丝","四喜丸子",
            "酸菜鱼","水煮鱼",
            "麻婆豆腐","皮蛋豆腐",
            "小笼包","灌汤包",
            "玫瑰","月季",
            "薰衣草","满天星",
            "董永","许仙",
            "张韶涵","王心凌",
            "刘诗诗","刘亦菲",
            "晴川","若曦",
            "何炅","维嘉",
            "谢娜","李湘",
            "孟非","乐嘉",
            "天天向上","非诚勿扰",
            "全力以赴","勇往直前",
            "班主任","辅导员",
            "包青天","狄仁杰",
            "金丝猴","大白兔",
            "牛奶","豆浆",
            "果粒橙","鲜橙多",
            "保安","保镖",
            "过山车","碰碰车",
            "铁观音","碧螺春",
            "生菜","白菜",
            "辣椒","芥末",
            "猴","猿",
            "天龙八部","神雕侠侣",
            "降龙十八掌","九阴白骨爪",
            "金庸","古龙",
            "赵敏","黄蓉",
            "自行车","电动车",
            "海豚","海狮",
            "沐浴露","沐浴盐",
            "洗发露","护发素",
            "水盆","水桶",
            "语无伦次","词不达意",
            "鼠目寸光","井底之蛙",
            "唇膏","口红",
            "森马","以纯",
            "近视眼镜","隐形眼镜",
            "联通","移动",
            "东方神起","至上励合",
            "泡泡糖","棒棒糖",
            "小沈阳","宋小宝",
            "土豆粉","酸辣粉",
            "涮肉","烤肉",
            "气泡","水泡",
            "蜘蛛侠","蝙蝠侠",
            "木糖醇","口香糖",
            "美人心计","倾世皇妃",
            "夏家三千金","爱情睡醒了",
            "红楼梦","甄嬛传",
            "甄子丹","李连杰",
            "贵妃醉酒","黛玉葬花",
            "纸巾","手帕",
            "苏州","杭州",
            "香港","台湾",
            "红烧牛肉面","香辣牛肉面",
            "橙子","橘子",
            "葡萄","提子",
            "太监","人妖",
            "蝴蝶","蜜蜂",
            "花样男子","流星花园"
    };
}
