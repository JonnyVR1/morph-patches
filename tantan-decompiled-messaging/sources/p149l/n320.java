package p149l;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.p048ui.RoundedView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsFragOld;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class n320 extends p3l {

    /* JADX INFO: renamed from: f */
    public CardBottomExpandedBasicInfoView f136899f;

    /* JADX INFO: renamed from: g */
    public VText f136900g;

    /* JADX INFO: renamed from: h */
    public VText f136901h;

    /* JADX INFO: renamed from: i */
    public VText f136902i;

    /* JADX INFO: renamed from: j */
    public RoundedView f136903j;

    /* JADX INFO: renamed from: k */
    public VText f136904k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f136905l;

    /* JADX INFO: renamed from: m */
    public User f136906m;

    /* JADX INFO: renamed from: l.n320$a */
    public class C18617a extends ym2 {
        public C18617a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) n320.this.f136899f.f23465h.getLayoutParams();
            int i = t100.f167266o;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            n320.this.f136899f.f23465h.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m157692G(View view) {
    }

    /* JADX INFO: renamed from: K */
    private void m157693K(User user) {
        boolean zIsNewHere = user.isNewHere();
        VText vText = this.f136901h;
        if (zIsNewHere) {
            xdl0.m208344M(vText, xdl0.m208349O0(this.f136902i));
            xdl0.m208344M(this.f136900g, true);
        } else {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f136900g, false);
        }
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, final User user, int i, int i2, int i3) {
        this.f136906m = user;
        this.f136899f.setTextColor(App.f15369e.getResources().getColor(w0c0.f183818X));
        this.f136899f.m38909W(user, user.isMe(), false);
        xdl0.m208329E0(this.f136899f, new View.OnClickListener() { // from class: l.i320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n320.m157692G(view);
            }
        });
        m157698M(user, userInfo, this.f136902i);
        m157693K(user);
        m157697L(user);
        m209781k(m167252w(), CoreModule.f17545c.f19639e0.m169523o9()).filter(new w9j() { // from class: l.j320
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(user.isMe());
            }
        }).map(new w9j() { // from class: l.k320
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user2 = (User) obj;
                return Boolean.valueOf((user2.membership.hideActivityTime && user2.isVIP()) ? false : true);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.l320
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125841a.m157696J(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public final void m157694H(View view) {
        o320.m162352a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m157695I(View view) {
        zvf0.m220396r("e_profile_page_hide_active_time_button", OMSDialogPositon.p_suggest_user_profile_info_view);
        Intent intent = new Intent(m167252w(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        m167252w().startActivity(intent);
    }

    /* JADX INFO: renamed from: J */
    public void m157696J(boolean z) {
        boolean z2 = z && xdl0.m208349O0(this.f136902i) && !TextUtils.isEmpty(this.f136902i.getText());
        xdl0.m208344M(this.f136904k, z2);
        xdl0.m208344M(this.f136903j, z2);
        this.f136904k.setText(App.f15369e.getString(R$string.f17876K9));
        xdl0.m208329E0(this.f136904k, new View.OnClickListener() { // from class: l.m320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131010a.m157695I(view);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m157697L(User user) {
        Settings settings;
        List<SettingGroups> list;
        xdl0.m208344M(this.f136905l, false);
        xdl0.m208344M(this.f136899f.f23465h, false);
        xdl0.m208359W(this.f136899f, 0);
        if (!qp8.m175817b() || (settings = user.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || user.settings.settingGroups.get(0) == null || user.settings.settingGroups.get(0).live == null) {
            return;
        }
        if (user.settings.settingGroups.get(0).live.hideProfileWealthTag.booleanValue()) {
            xdl0.m208344M(this.f136905l, false);
            xdl0.m208344M(this.f136899f.f23465h, false);
            return;
        }
        UserWealthGradeConfig userWealthGradeConfigMo67219Gj = CoreModule.m29936Q().mo67219Gj(user.settings.settingGroups.get(0).live.wealthGrade, false);
        if (TextUtils.isEmpty(userWealthGradeConfigMo67219Gj.wealthIconUrl)) {
            return;
        }
        if (!userWealthGradeConfigMo67219Gj.openNewIcon) {
            xdl0.m208344M(this.f136905l, false);
            xdl0.m208344M(this.f136899f.f23465h, true);
            qib0.f154691G.m102333M0(this.f136899f.f23465h, userWealthGradeConfigMo67219Gj.wealthIconUrl, new C18617a());
        } else {
            xdl0.m208344M(this.f136899f.f23465h, false);
            xdl0.m208344M(this.f136905l, true);
            qib0.f154691G.m102356Z0(this.f136905l, userWealthGradeConfigMo67219Gj.wealthIconUrl);
            xdl0.m208359W(this.f136899f, t100.m186890d(56.0f));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m157698M(User user, CoreSuggested.UserInfo userInfo, VText vText) {
        xdl0.m208344M(vText, true);
        String strM181733M0 = rza.m181733M0(CoreModule.f17544b, user);
        if (TextUtils.equals("p_tantanx_card", userInfo.from) && !TextUtils.isEmpty(strM181733M0)) {
            String[] strArrSplit = strM181733M0.split("·");
            if (strArrSplit.length > 0) {
                strM181733M0 = strArrSplit[0].trim();
            }
        }
        if (NullChecker.m81304b(user.profile) && NullChecker.m81304b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (user.isMe() && NullChecker.m81303a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM181733M0)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM181733M0);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM181733M0);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + "  " + strM181733M0);
                return;
            }
        }
        if (TextUtils.isEmpty(strM181733M0)) {
            xdl0.m208344M(vText, false);
        } else {
            vText.setText(strM181733M0);
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m157694H(view);
    }
}
