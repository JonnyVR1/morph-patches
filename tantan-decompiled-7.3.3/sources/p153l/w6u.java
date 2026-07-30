package p153l;

import com.tantanapp.foxstatistics.entity.EventNameEnum;

/* JADX INFO: loaded from: classes9.dex */
public class w6u {
    /* JADX INFO: renamed from: a */
    public static void m205196a(l4g0 l4g0Var) {
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            l4g0Var.m152770e();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m205197b(l4g0 l4g0Var) {
        if (l4g0Var != null) {
            l4g0Var.m152768c();
            l4g0Var.m152777l();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m205198c(String str) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_audio_explore_recommend";
        i4g0.m138517o(q4fVar, jyb.m147494Y("audio_tab_id", str));
    }
}
