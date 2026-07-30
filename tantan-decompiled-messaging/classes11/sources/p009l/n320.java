package p009l;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.ui.RoundedView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.settings.SettingsFragOld;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealthGradeConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.mkd0;
import l.ngm;
import l.o320;
import l.qib0;
import l.qp8;
import l.rza;
import l.t100;
import l.w0c0;
import l.w9j;
import l.xdl0;
import l.ym2;
import l.zvf0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class n320 extends p3l {

    /* JADX INFO: renamed from: f */
    public CardBottomExpandedBasicInfoView f17211f;

    /* JADX INFO: renamed from: g */
    public VText f17212g;

    /* JADX INFO: renamed from: h */
    public VText f17213h;

    /* JADX INFO: renamed from: i */
    public VText f17214i;

    /* JADX INFO: renamed from: j */
    public RoundedView f17215j;

    /* JADX INFO: renamed from: k */
    public VText f17216k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f17217l;

    /* JADX INFO: renamed from: m */
    public User f17218m;

    /* JADX INFO: renamed from: l.n320$a */
    public class C1041a extends ym2 {
        public C1041a() {
        }

        /* JADX INFO: renamed from: h */
        public void m18766h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) n320.this.f17211f.f2243h.getLayoutParams();
            int i = t100.o;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            n320.this.f17211f.f2243h.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m18759G(View view) {
    }

    /* JADX INFO: renamed from: K */
    private void m18760K(User user) {
        boolean zIsNewHere = user.isNewHere();
        VText vText = this.f17213h;
        if (zIsNewHere) {
            xdl0.M(vText, xdl0.O0(this.f17214i));
            xdl0.M(this.f17212g, true);
        } else {
            xdl0.M(vText, false);
            xdl0.M(this.f17212g, false);
        }
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, final User user, int i, int i2, int i3) {
        this.f17218m = user;
        this.f17211f.setTextColor(App.e.getResources().getColor(w0c0.X));
        this.f17211f.m2916W(user, user.isMe(), false);
        xdl0.E0(this.f17211f, new View.OnClickListener() { // from class: l.i320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n320.m18759G(view);
            }
        });
        m18765M(user, userInfo, this.f17214i);
        m18760K(user);
        m18764L(user);
        m24919k(m20098w(), CoreModule.c.e0.o9()).filter(new w9j() { // from class: l.j320
            public final Object call(Object obj) {
                return Boolean.valueOf(user.isMe());
            }
        }).map(new w9j() { // from class: l.k320
            public final Object call(Object obj) {
                User user2 = (User) obj;
                return Boolean.valueOf((user2.membership.hideActivityTime && user2.isVIP()) ? false : true);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.l320
            public final void call(Object obj) {
                this.f15924a.m18763J(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public final void m18761H(View view) {
        o320.a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m18762I(View view) {
        zvf0.r("e_profile_page_hide_active_time_button", "p_suggest_user_profile_info_view");
        Intent intent = new Intent((Context) m20098w(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        m20098w().startActivity(intent);
    }

    /* JADX INFO: renamed from: J */
    public void m18763J(boolean z) {
        boolean z2 = z && xdl0.O0(this.f17214i) && !TextUtils.isEmpty(this.f17214i.getText());
        xdl0.M(this.f17216k, z2);
        xdl0.M(this.f17215j, z2);
        this.f17216k.setText(App.e.getString(R.string.K9));
        xdl0.E0(this.f17216k, new View.OnClickListener() { // from class: l.m320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16492a.m18762I(view);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m18764L(User user) {
        Settings settings;
        List list;
        xdl0.M(this.f17217l, false);
        xdl0.M(this.f17211f.f2243h, false);
        xdl0.W(this.f17211f, 0);
        if (!qp8.b() || (settings = user.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || user.settings.settingGroups.get(0) == null || ((SettingGroups) user.settings.settingGroups.get(0)).live == null) {
            return;
        }
        if (((SettingGroups) user.settings.settingGroups.get(0)).live.hideProfileWealthTag.booleanValue()) {
            xdl0.M(this.f17217l, false);
            xdl0.M(this.f17211f.f2243h, false);
            return;
        }
        UserWealthGradeConfig userWealthGradeConfigM9009Gj = CoreModule.Q().m9009Gj(((SettingGroups) user.settings.settingGroups.get(0)).live.wealthGrade, false);
        if (TextUtils.isEmpty(userWealthGradeConfigM9009Gj.wealthIconUrl)) {
            return;
        }
        if (!userWealthGradeConfigM9009Gj.openNewIcon) {
            xdl0.M(this.f17217l, false);
            xdl0.M(this.f17211f.f2243h, true);
            qib0.G.M0(this.f17211f.f2243h, userWealthGradeConfigM9009Gj.wealthIconUrl, new C1041a());
        } else {
            xdl0.M(this.f17211f.f2243h, false);
            xdl0.M(this.f17217l, true);
            qib0.G.Z0(this.f17217l, userWealthGradeConfigM9009Gj.wealthIconUrl);
            xdl0.W(this.f17211f, t100.d(56.0f));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m18765M(User user, CoreSuggested.UserInfo userInfo, VText vText) {
        xdl0.M(vText, true);
        String strM0 = rza.M0(CoreModule.b, user);
        if (TextUtils.equals("p_tantanx_card", userInfo.from) && !TextUtils.isEmpty(strM0)) {
            String[] strArrSplit = strM0.split("·");
            if (strArrSplit.length > 0) {
                strM0 = strArrSplit[0].trim();
            }
        }
        if (NullChecker.b(user.profile) && NullChecker.b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (user.isMe() && NullChecker.a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM0)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM0);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM0);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + "  " + strM0);
                return;
            }
        }
        if (TextUtils.isEmpty(strM0)) {
            xdl0.M(vText, false);
        } else {
            vText.setText(strM0);
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m18761H(view);
    }
}
