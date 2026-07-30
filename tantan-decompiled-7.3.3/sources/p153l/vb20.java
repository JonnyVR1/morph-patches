package p153l;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.p053ui.RoundedView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class vb20 extends f6l {

    /* JADX INFO: renamed from: f */
    public CardBottomExpandedBasicInfoView f183184f;

    /* JADX INFO: renamed from: g */
    public VText f183185g;

    /* JADX INFO: renamed from: h */
    public VText f183186h;

    /* JADX INFO: renamed from: i */
    public VText f183187i;

    /* JADX INFO: renamed from: j */
    public RoundedView f183188j;

    /* JADX INFO: renamed from: k */
    public VText f183189k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f183190l;

    /* JADX INFO: renamed from: m */
    public User f183191m;

    /* JADX INFO: renamed from: l.vb20$a */
    public class C20801a extends fn2 {
        public C20801a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vb20.this.f183184f.f24207h.getLayoutParams();
            int i = qa00.f156328o;
            layoutParams.height = i;
            layoutParams.width = (int) ((qimVar.getWidth() / qimVar.getHeight()) * i);
            vb20.this.f183184f.f24207h.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m200677G(View view) {
    }

    /* JADX INFO: renamed from: K */
    private void m200678K(User user) {
        boolean zIsNewHere = user.isNewHere();
        VText vText = this.f183186h;
        if (zIsNewHere) {
            bnl0.m105524M(vText, bnl0.m105529O0(this.f183187i));
            bnl0.m105524M(this.f183185g, true);
        } else {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f183185g, false);
        }
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, final User user, int i, int i2, int i3) {
        this.f183191m = user;
        this.f183184f.setTextColor(App.f16088e.getResources().getColor(c9c0.f80390Y));
        this.f183184f.m39912W(user, user.isMe(), false);
        bnl0.m105509E0(this.f183184f, new View.OnClickListener() { // from class: l.qb20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vb20.m200677G(view);
            }
        });
        m200683M(user, userInfo, this.f183187i);
        m200678K(user);
        m200682L(user);
        m116950k(m124283w(), CoreModule.f18264c.f20381e0.m116596o9()).filter(new qcj() { // from class: l.rb20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(user.isMe());
            }
        }).map(new qcj() { // from class: l.sb20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user2 = (User) obj;
                return Boolean.valueOf((user2.membership.hideActivityTime && user2.isVIP()) ? false : true);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tb20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172828a.m200681J(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public final void m200679H(View view) {
        wb20.m205702a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m200680I(View view) {
        i4g0.m138520r("e_profile_page_hide_active_time_button", OMSDialogPositon.p_suggest_user_profile_info_view);
        Intent intent = new Intent(m124283w(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        m124283w().startActivity(intent);
    }

    /* JADX INFO: renamed from: J */
    public void m200681J(boolean z) {
        boolean z2 = z && bnl0.m105529O0(this.f183187i) && !TextUtils.isEmpty(this.f183187i.getText());
        bnl0.m105524M(this.f183189k, z2);
        bnl0.m105524M(this.f183188j, z2);
        this.f183189k.setText(App.f16088e.getString(R$string.f18906U9));
        bnl0.m105509E0(this.f183189k, new View.OnClickListener() { // from class: l.ub20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178257a.m200680I(view);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m200682L(User user) {
        Settings settings;
        List<SettingGroups> list;
        bnl0.m105524M(this.f183190l, false);
        bnl0.m105524M(this.f183184f.f24207h, false);
        bnl0.m105539W(this.f183184f, 0);
        if (!vq8.m202358b() || (settings = user.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || user.settings.settingGroups.get(0) == null || user.settings.settingGroups.get(0).live == null) {
            return;
        }
        if (user.settings.settingGroups.get(0).live.hideProfileWealthTag.booleanValue()) {
            bnl0.m105524M(this.f183190l, false);
            bnl0.m105524M(this.f183184f.f24207h, false);
            return;
        }
        UserWealthGradeConfig userWealthGradeConfigMo68402Gj = CoreModule.m30934Q().mo68402Gj(user.settings.settingGroups.get(0).live.wealthGrade, false);
        if (TextUtils.isEmpty(userWealthGradeConfigMo68402Gj.wealthIconUrl)) {
            return;
        }
        if (!userWealthGradeConfigMo68402Gj.openNewIcon) {
            bnl0.m105524M(this.f183190l, false);
            bnl0.m105524M(this.f183184f.f24207h, true);
            uqb0.f180374G.m127117M0(this.f183184f.f24207h, userWealthGradeConfigMo68402Gj.wealthIconUrl, new C20801a());
        } else {
            bnl0.m105524M(this.f183184f.f24207h, false);
            bnl0.m105524M(this.f183190l, true);
            uqb0.f180374G.m127140Z0(this.f183190l, userWealthGradeConfigMo68402Gj.wealthIconUrl);
            bnl0.m105539W(this.f183184f, qa00.m175859d(56.0f));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m200683M(User user, CoreSuggested.UserInfo userInfo, VText vText) {
        bnl0.m105524M(vText, true);
        String strM118955M0 = e1b.m118955M0(CoreModule.f18263b, user);
        if (TextUtils.equals("p_tantanx_card", userInfo.from) && !TextUtils.isEmpty(strM118955M0)) {
            String[] strArrSplit = strM118955M0.split("·");
            if (strArrSplit.length > 0) {
                strM118955M0 = strArrSplit[0].trim();
            }
        }
        if (NullChecker.m82487b(user.profile) && NullChecker.m82487b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (user.isMe() && NullChecker.m82486a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM118955M0)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM118955M0);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM118955M0);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + "  " + strM118955M0);
                return;
            }
        }
        if (TextUtils.isEmpty(strM118955M0)) {
            bnl0.m105524M(vText, false);
        } else {
            vText.setText(strM118955M0);
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m200679H(view);
    }
}
