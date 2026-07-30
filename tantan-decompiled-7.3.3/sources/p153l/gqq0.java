package p153l;

import android.app.Activity;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.MemberZoneFilter;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/gqq0;", "Ll/ij2;", "Ll/mqq0;", "Ll/pej0;", "dlg", "Ll/s1e;", "lifecycleProvider", "<init>", "(Ll/pej0;Ll/s1e;)V", "", "e", "()V", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "editData", "f", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;)V", "c", "Ll/pej0;", Constants.INAPP_DATA_TAG, "()Ll/pej0;", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gqq0 extends ij2<mqq0> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final pej0 dlg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqq0(@NotNull pej0 pej0Var, @NotNull s1e s1eVar) {
        super(s1eVar);
        pej0Var.getClass();
        s1eVar.getClass();
        this.dlg = pej0Var;
        Activity activityM172030s = pej0Var.m172030s();
        activityM172030s.getClass();
        this.act = (Act) activityM172030s;
    }

    /* JADX INFO: renamed from: c */
    public static void m131420c(gqq0 gqq0Var, MemberZoneFilter memberZoneFilter) {
        mqq0 mqq0Var = (mqq0) gqq0Var.f115168a;
        memberZoneFilter.getClass();
        mqq0Var.m159558B(memberZoneFilter);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final pej0 getDlg() {
        return this.dlg;
    }

    /* JADX INFO: renamed from: e */
    public final void m131422e() {
        duringCreated(eqq0.INSTANCE.m122047c().m122038h()).distinctUntilChanged().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.fqq0
            @Override // p153l.y20
            public final void call(Object obj) {
                gqq0.m131420c(this.f100332a, (MemberZoneFilter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m131423f(@NotNull MemberZoneFilter editData) {
        editData.getClass();
        eqq0.Companion companion = eqq0.INSTANCE;
        companion.m122047c().m122044p(true);
        companion.m122047c().m122043o(editData);
        i4g0.m138495D("e_save_filter_value", "p_advanced_filter_page", jyb.m147494Y("suggest_see_user_search_max_age", Integer.valueOf(editData.max_age)), jyb.m147494Y("suggest_see_user_search_min_age", Integer.valueOf(editData.min_age)), jyb.m147494Y("suggest_see_user_search_radius", Integer.valueOf(editData.radius)), jyb.m147494Y("advanced_filter_real", Boolean.valueOf(editData.realFace)), jyb.m147494Y("advanced_filter_pop", Boolean.valueOf(editData.popular)), jyb.m147494Y("advanced_filter_matched", Boolean.valueOf(editData.matched)), jyb.m147494Y("advanced_filter_rich_info", Boolean.valueOf(editData.richMedia)), jyb.m147494Y("advanced_filter_online", Boolean.valueOf(editData.online)), jyb.m147494Y("advanced_filter_real_name", Boolean.valueOf(editData.certification)));
        this.dlg.dismiss();
    }
}
