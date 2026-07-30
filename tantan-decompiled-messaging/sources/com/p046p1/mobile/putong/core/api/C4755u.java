package com.p046p1.mobile.putong.core.api;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p149l.ax6;
import p149l.knb0;
import p149l.px6;
import p149l.qx6;
import p149l.rx6;
import p149l.vwb;
import p149l.x9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.u */
/* JADX INFO: loaded from: classes9.dex */
public class C4755u extends ax6 {

    /* JADX INFO: renamed from: R */
    public static ConcurrentHashMap<String, knb0<x9j<String, String, Boolean>, ArrayList<String>, String, String>> f20121R = new ConcurrentHashMap<>();

    static {
        m34766a3();
    }

    /* JADX INFO: renamed from: a3 */
    public static void m34766a3() {
        f20121R.clear();
        f20121R.put("christmas", vwb.m200312Z(new px6(), vwb.m200324f0("christmas", "圣诞"), "animations/christmas/config.xml", "animations/christmas/pic"));
        f20121R.put("hi", vwb.m200312Z(new qx6(), vwb.m200324f0("hi", "你好", "hello"), "animations/hi/config.xml", "animations/hi/pic"));
        f20121R.put("no", vwb.m200312Z(new qx6(), vwb.m200324f0("no", "不是"), "animations/no/config.xml", "animations/no/pic"));
        f20121R.put("singleDog", vwb.m200312Z(new px6(), vwb.m200324f0("单身狗"), "animations/singleDog/config.xml", "animations/singleDog/pic"));
        f20121R.put("what", vwb.m200312Z(new rx6(), vwb.m200324f0("什么", "什么？", "什么呢？", "什么呢"), "animations/what/config.xml", "animations/what/pic"));
        f20121R.put("smile", vwb.m200312Z(new px6(), vwb.m200324f0("[大笑]", "[laugh]"), "animations/smile/config.xml", "animations/smile/pic"));
        f20121R.put("cry", vwb.m200312Z(new px6(), vwb.m200324f0("[crying]", "[哭]", "[失望]", "[disappointed]"), "animations/cry/config.xml", "animations/cry/pic"));
        f20121R.put("yeah", vwb.m200312Z(new px6(), vwb.m200324f0("[调皮]", "[naughty]", "[吐舌]", "[tongue]"), "animations/yeah/config.xml", "animations/yeah/pic"));
    }
}
