package com.p000p1.mobile.putong.core.api;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import l.knb0;
import l.vwb;
import l.x9j;
import p006l.ax6;
import p006l.px6;
import p006l.qx6;
import p006l.rx6;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.u */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0181u extends ax6 {

    /* JADX INFO: renamed from: R */
    public static ConcurrentHashMap<String, knb0<x9j<String, String, Boolean>, ArrayList<String>, String, String>> f4110R = new ConcurrentHashMap<>();

    static {
        m6703a3();
    }

    /* JADX INFO: renamed from: a3 */
    public static void m6703a3() {
        f4110R.clear();
        f4110R.put("christmas", vwb.Z(new px6(), vwb.f0(new String[]{"christmas", "圣诞"}), "animations/christmas/config.xml", "animations/christmas/pic"));
        f4110R.put("hi", vwb.Z(new qx6(), vwb.f0(new String[]{"hi", "你好", "hello"}), "animations/hi/config.xml", "animations/hi/pic"));
        f4110R.put("no", vwb.Z(new qx6(), vwb.f0(new String[]{"no", "不是"}), "animations/no/config.xml", "animations/no/pic"));
        f4110R.put("singleDog", vwb.Z(new px6(), vwb.f0(new String[]{"单身狗"}), "animations/singleDog/config.xml", "animations/singleDog/pic"));
        f4110R.put("what", vwb.Z(new rx6(), vwb.f0(new String[]{"什么", "什么？", "什么呢？", "什么呢"}), "animations/what/config.xml", "animations/what/pic"));
        f4110R.put("smile", vwb.Z(new px6(), vwb.f0(new String[]{"[大笑]", "[laugh]"}), "animations/smile/config.xml", "animations/smile/pic"));
        f4110R.put("cry", vwb.Z(new px6(), vwb.f0(new String[]{"[crying]", "[哭]", "[失望]", "[disappointed]"}), "animations/cry/config.xml", "animations/cry/pic"));
        f4110R.put("yeah", vwb.Z(new px6(), vwb.f0(new String[]{"[调皮]", "[naughty]", "[吐舌]", "[tongue]"}), "animations/yeah/config.xml", "animations/yeah/pic"));
    }
}
