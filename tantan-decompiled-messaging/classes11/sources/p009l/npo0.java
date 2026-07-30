package p009l;

import com.tantanapp.foxstatistics.entity.EventNameEnum;
import l.j760;
import l.l3f;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class npo0 {
    /* JADX INFO: renamed from: a */
    public static void m19003a(String str) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE_CLICK;
        l3fVar.n = str;
        l3fVar.s = "e_audio_cp_agreememt";
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: b */
    public static void m19004b() {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE_CLICK;
        l3fVar.n = "p_audio_cp_activity_my_cp";
        l3fVar.s = "e_audio_invite_cp";
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: c */
    public static void m19005c() {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE_CLICK;
        l3fVar.n = "p_audio_cp_activity_my_cp";
        l3fVar.s = "e_audio_cp_house";
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m19006d() {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE_CLICK;
        l3fVar.n = "p_audio_cp_activity_my_cp";
        l3fVar.s = "e_audio_cp_house_tab";
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: e */
    public static void m19007e() {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE_CLICK;
        l3fVar.n = "p_audio_cp_activity_my_cp";
        l3fVar.s = "e_audio_cp_rank";
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: f */
    public static void m19008f(String str) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE_CLICK;
        l3fVar.n = str;
        l3fVar.s = "e_audio_cp_sendgift";
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: g */
    public static void m19009g() {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE_CLICK;
        l3fVar.n = "p_audio_cp_activity_my_cp";
        l3fVar.s = "e_audio_cp_daily_sign_task";
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: h */
    public static void m19010h(String str) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        l3fVar.n = "p_audio_cp_activity_my_cp";
        zvf0.o(l3fVar, new j760[]{vwb.Y("audio_cp_source", str)});
    }
}
