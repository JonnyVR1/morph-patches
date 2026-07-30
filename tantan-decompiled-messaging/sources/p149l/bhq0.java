package p149l;

import android.app.Activity;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.MemberZoneFilter;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/bhq0;", "Ll/aj2;", "Ll/hhq0;", "Ll/l5j0;", "dlg", "Ll/e0e;", "lifecycleProvider", "<init>", "(Ll/l5j0;Ll/e0e;)V", "", "e", "()V", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "editData", "f", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;)V", "c", "Ll/l5j0;", Constants.INAPP_DATA_TAG, "()Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class bhq0 extends aj2<hhq0> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final l5j0 dlg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhq0(@NotNull l5j0 l5j0Var, @NotNull e0e e0eVar) {
        super(e0eVar);
        l5j0Var.getClass();
        e0eVar.getClass();
        this.dlg = l5j0Var;
        Activity activityM148647s = l5j0Var.m148647s();
        activityM148647s.getClass();
        this.act = (Act) activityM148647s;
    }

    /* JADX INFO: renamed from: c */
    public static void m101912c(bhq0 bhq0Var, MemberZoneFilter memberZoneFilter) {
        hhq0 hhq0Var = (hhq0) bhq0Var.f70081a;
        memberZoneFilter.getClass();
        hhq0Var.m131105B(memberZoneFilter);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final l5j0 getDlg() {
        return this.dlg;
    }

    /* JADX INFO: renamed from: e */
    public final void m101914e() {
        duringCreated(zgq0.INSTANCE.m218685c().m218676h()).distinctUntilChanged().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.ahq0
            @Override // p149l.e30
            public final void call(Object obj) {
                bhq0.m101912c(this.f69683a, (MemberZoneFilter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m101915f(@NotNull MemberZoneFilter editData) {
        editData.getClass();
        zgq0.Companion companion = zgq0.INSTANCE;
        companion.m218685c().m218682p(true);
        companion.m218685c().m218681o(editData);
        zvf0.m220371D("e_save_filter_value", "p_advanced_filter_page", vwb.m200311Y("suggest_see_user_search_max_age", Integer.valueOf(editData.max_age)), vwb.m200311Y("suggest_see_user_search_min_age", Integer.valueOf(editData.min_age)), vwb.m200311Y("suggest_see_user_search_radius", Integer.valueOf(editData.radius)), vwb.m200311Y("advanced_filter_real", Boolean.valueOf(editData.realFace)), vwb.m200311Y("advanced_filter_pop", Boolean.valueOf(editData.popular)), vwb.m200311Y("advanced_filter_matched", Boolean.valueOf(editData.matched)), vwb.m200311Y("advanced_filter_rich_info", Boolean.valueOf(editData.richMedia)), vwb.m200311Y("advanced_filter_online", Boolean.valueOf(editData.online)), vwb.m200311Y("advanced_filter_real_name", Boolean.valueOf(editData.certification)));
        this.dlg.dismiss();
    }
}
