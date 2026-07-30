package com.p051p1.mobile.putong.core.api;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p153l.dy6;
import p153l.jyb;
import p153l.ovb0;
import p153l.rcj;
import p153l.sy6;
import p153l.ty6;
import p153l.uy6;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.u */
/* JADX INFO: loaded from: classes9.dex */
public class C4906u extends dy6 {

    /* JADX INFO: renamed from: R */
    public static ConcurrentHashMap<String, ovb0<rcj<String, String, Boolean>, ArrayList<String>, String, String>> f20863R = new ConcurrentHashMap<>();

    static {
        m35769a3();
    }

    /* JADX INFO: renamed from: a3 */
    public static void m35769a3() {
        f20863R.clear();
        f20863R.put("christmas", jyb.m147495Z(new sy6(), jyb.m147507f0("christmas", "圣诞"), "animations/christmas/config.xml", "animations/christmas/pic"));
        f20863R.put("hi", jyb.m147495Z(new ty6(), jyb.m147507f0("hi", "你好", "hello"), "animations/hi/config.xml", "animations/hi/pic"));
        f20863R.put("no", jyb.m147495Z(new ty6(), jyb.m147507f0("no", "不是"), "animations/no/config.xml", "animations/no/pic"));
        f20863R.put("singleDog", jyb.m147495Z(new sy6(), jyb.m147507f0("单身狗"), "animations/singleDog/config.xml", "animations/singleDog/pic"));
        f20863R.put("what", jyb.m147495Z(new uy6(), jyb.m147507f0("什么", "什么？", "什么呢？", "什么呢"), "animations/what/config.xml", "animations/what/pic"));
        f20863R.put("smile", jyb.m147495Z(new sy6(), jyb.m147507f0("[大笑]", "[laugh]"), "animations/smile/config.xml", "animations/smile/pic"));
        f20863R.put("cry", jyb.m147495Z(new sy6(), jyb.m147507f0("[crying]", "[哭]", "[失望]", "[disappointed]"), "animations/cry/config.xml", "animations/cry/pic"));
        f20863R.put("yeah", jyb.m147495Z(new sy6(), jyb.m147507f0("[调皮]", "[naughty]", "[吐舌]", "[tongue]"), "animations/yeah/config.xml", "animations/yeah/pic"));
    }
}
