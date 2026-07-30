package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class s9k0<D extends oo2> implements iam<u9k0<D>> {

    /* JADX INFO: renamed from: a */
    public final x3t f166940a = new x3t(true);

    /* JADX INFO: renamed from: b */
    public u9k0<D> f166941b;

    /* JADX INFO: renamed from: c */
    public UserCardMedalAndNameView f166942c;

    /* JADX INFO: renamed from: d */
    public DownloadTask f166943d;

    /* JADX INFO: renamed from: e */
    public Bitmap f166944e;

    public s9k0(UserCardMedalAndNameView userCardMedalAndNameView) {
        this.f166942c = userCardMedalAndNameView;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m185190a(User user, View view) {
        o1j0.m165651y("ID已复制");
        na5.m162056c(view.getContext()).m162057a("tantan userID", user.publicId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m185193f(File file) {
        this.f166944e = ps40.m173587h(this.f166942c.f50272j, file);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f166942c.f50263a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u9k0<D> u9k0Var) {
        this.f166941b = u9k0Var;
    }

    @Override // p153l.iam
    public void destroy() {
        this.f166942c.f50272j.setBackground(getContext().getDrawable(obc0.f146166R));
        bnl0.m105524M(this.f166942c.f50272j, false);
        ps40.m173584e(this.f166944e, this.f166943d);
    }

    /* JADX INFO: renamed from: e */
    public void m185195e(String str) {
        File fileM173583d = ps40.m173583d(getContext(), str);
        if (fileM173583d.exists()) {
            m185196i(fileM173583d);
        } else {
            this.f166943d = ps40.m173585f(str, fileM173583d, new y20() { // from class: l.q9k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156245a.m185196i((File) obj);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m185196i(final File file) {
        bnl0.m105524M(this.f166942c.f50272j, true);
        l51.m152887G(new Runnable() { // from class: l.r9k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161832a.m185193f(file);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m185197j(User user) {
        if (user == null) {
            this.f166942c.f50263a.setVisibility(8);
            this.f166942c.f50266d.setVisibility(8);
            this.f166942c.f50269g.setVisibility(8);
            return;
        }
        boolean zM206159b = wft.m206159b(2);
        x3t x3tVar = this.f166940a;
        if (zM206159b) {
            Act act = getAct();
            UserCardMedalAndNameView userCardMedalAndNameView = this.f166942c;
            x3tVar.m209278k(act, userCardMedalAndNameView.f50274l, userCardMedalAndNameView.f50275m, userCardMedalAndNameView.f50276n, userCardMedalAndNameView.f50277o, userCardMedalAndNameView.f50278p);
        } else {
            Act act2 = getAct();
            UserCardMedalAndNameView userCardMedalAndNameView2 = this.f166942c;
            x3tVar.m209278k(act2, userCardMedalAndNameView2.f50274l, userCardMedalAndNameView2.f50275m, userCardMedalAndNameView2.f50276n, userCardMedalAndNameView2.f50277o);
        }
        this.f166940a.m209291y(user);
        this.f166942c.f50263a.setText(user.name);
        this.f166942c.f50263a.setVisibility(0);
        this.f166942c.f50269g.setVisibility(0);
        boolean zM206159b2 = wft.m206159b(2);
        UserCardMedalAndNameView userCardMedalAndNameView3 = this.f166942c;
        if (zM206159b2) {
            userCardMedalAndNameView3.f50271i.setText(String.valueOf(user.age));
            this.f166942c.f50271i.setCompoundDrawablesWithIntrinsicBounds(TEnum.equals(user.gender, "male") ? obc0.f146227W5 : obc0.f146205U5, 0, 0, 0);
            this.f166942c.f50271i.setCompoundDrawablePadding(qa00.f156314a);
            this.f166942c.f50271i.setBackground(jde.m144406b(TEnum.equals(user.gender, "male") ? -12664075 : -30235, qa00.m175859d(4.0f)));
            bnl0.m105524M(this.f166942c.f50271i, !user.isHideAgeFromSVip());
        } else {
            userCardMedalAndNameView3.f50264b.setText(String.valueOf(user.age));
            this.f166942c.f50265c.setBackground(n3d0.m161278b(TEnum.equals(user.gender, "male") ? obc0.f146046G8 : obc0.f146022E8));
            bnl0.m105524M(this.f166942c.f50264b, !user.isHideAgeFromSVip());
        }
        this.f166942c.f50270h.setText(q8g0.m175804j0(user.profile.zodiac));
        this.f166942c.f50270h.setVisibility(0);
        m185199l(user);
        m185200m(user, this.f166941b.m195102l4());
    }

    /* JADX INFO: renamed from: k */
    public void m185198k(nsv<User> nsvVar) {
        if (!e3t.m119319a(nsvVar).m119322d()) {
            m185197j(nsvVar != null ? nsvVar.f143542a : null);
            return;
        }
        this.f166942c.f50266d.setVisibility(8);
        this.f166942c.f50269g.setVisibility(8);
        this.f166942c.f50263a.setVisibility(0);
        this.f166942c.f50263a.setText(((e3t) nsvVar.m164642g()).f91997a.name);
    }

    /* JADX INFO: renamed from: l */
    public final void m185199l(User user) {
        bnl0.m105524M(this.f166942c.f50266d, true);
        this.f166942c.f50268f.setText(this.f166941b.m195101k4(user, yau.m214935c(user.profile.followships.counters.followers), q8g0.m175811p(user.location.distance, true), user.location.region.city));
    }

    /* JADX INFO: renamed from: m */
    public final void m185200m(final User user, boolean z) {
        if (TextUtils.isEmpty(user.publicId)) {
            this.f166942c.f50267e.setText("");
            return;
        }
        if (z) {
            Drawable drawable = getAct().getResources().getDrawable(obc0.f146010D8);
            drawable.setBounds(0, 0, qa00.f156329p, qa00.f156323j);
            this.f166942c.f50267e.setCompoundDrawables(drawable, null, null, null);
            this.f166942c.f50267e.setCompoundDrawablePadding(qa00.f156318e);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s  ·  ", user.publicId));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#AA7C38")), 0, user.publicId.length(), 34);
            this.f166942c.f50267e.setText(spannableStringBuilder);
        } else {
            this.f166942c.f50267e.setText(String.format("ID:%s  ·  ", user.publicId));
            this.f166942c.f50267e.setCompoundDrawables(null, null, null, null);
        }
        bnl0.m105509E0(this.f166942c.f50267e, new View.OnClickListener() { // from class: l.o9k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s9k0.m185190a(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m185201n(vak0 vak0Var) {
        List<BLiveUserProfileConfigHierarchy> list = vak0Var.m200538m().hierarchy;
        if (jyb.m147479J(list)) {
            return;
        }
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = (BLiveUserProfileConfigHierarchy) jyb.m147529r(list, new qcj() { // from class: l.p9k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserProfileConfigHierarchy) obj).type, "user"));
            }
        });
        if (!vak0Var.m200538m().enableNewPrivilege || bLiveUserProfileConfigHierarchy == null || TextUtils.isEmpty(bLiveUserProfileConfigHierarchy.titleBackUrl)) {
            bnl0.m105524M(this.f166942c.f50272j, false);
            return;
        }
        bnl0.m105524M(this.f166942c.f50272j, true);
        this.f166942c.f50273k.setText(bLiveUserProfileConfigHierarchy.title);
        this.f166942c.f50273k.setTextColor(n3d0.m161284h(bLiveUserProfileConfigHierarchy.titleColor, n3d0.m161277a(n9c0.f140877w1)));
        m185195e(bLiveUserProfileConfigHierarchy.titleBackUrl);
    }
}
