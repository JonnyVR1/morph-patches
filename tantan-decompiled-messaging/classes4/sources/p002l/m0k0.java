package p002l;

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
import com.p000p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p1.mobile.putong.ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import l.bk40;
import l.d1t;
import l.d30;
import l.e30;
import l.e51;
import l.fce;
import l.i0g0;
import l.kvc0;
import l.lsi0;
import l.m95;
import l.mqv;
import l.s7m;
import l.t100;
import l.vdt;
import l.vwb;
import l.w9j;
import l.x8u;
import l.xdl0;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m0k0<D extends ho2> implements s7m<o0k0<D>> {

    /* JADX INFO: renamed from: a */
    public final w1t f15192a = new w1t(true);

    /* JADX INFO: renamed from: b */
    public o0k0<D> f15193b;

    /* JADX INFO: renamed from: c */
    public UserCardMedalAndNameView f15194c;

    /* JADX INFO: renamed from: d */
    public DownloadTask f15195d;

    /* JADX INFO: renamed from: e */
    public Bitmap f15196e;

    public m0k0(UserCardMedalAndNameView userCardMedalAndNameView) {
        this.f15194c = userCardMedalAndNameView;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17641a(User user, View view) {
        lsi0.y("ID已复制");
        m95.c(view.getContext()).a("tantan userID", user.publicId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m17644f(File file) {
        this.f15196e = bk40.h(this.f15194c.f5466j, file);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17645C0() {
        return this.f15194c.f5457a.getContext();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m17649i1(o0k0<D> o0k0Var) {
        this.f15193b = o0k0Var;
    }

    public void destroy() {
        this.f15194c.f5466j.setBackground(m17645C0().getDrawable(i3c0.f12623R));
        xdl0.M(this.f15194c.f5466j, false);
        bk40.e(this.f15196e, this.f15195d);
    }

    /* JADX INFO: renamed from: e */
    public void m17647e(String str) {
        File fileD = bk40.d(m17645C0(), str);
        if (fileD.exists()) {
            m17648i(fileD);
        } else {
            this.f15195d = bk40.f(str, fileD, new e30() { // from class: l.k0k0
                public final void call(Object obj) {
                    this.f14162a.m17648i((File) obj);
                }
            }, (d30) null);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m17648i(final File file) {
        xdl0.M(this.f15194c.f5466j, true);
        e51.G(new Runnable() { // from class: l.l0k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14637a.m17644f(file);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m17650j(User user) {
        if (user == null) {
            this.f15194c.f5457a.setVisibility(8);
            this.f15194c.f5460d.setVisibility(8);
            this.f15194c.f5463g.setVisibility(8);
            return;
        }
        boolean zB = vdt.b(2);
        w1t w1tVar = this.f15192a;
        if (zB) {
            Act act = act();
            UserCardMedalAndNameView userCardMedalAndNameView = this.f15194c;
            w1tVar.m24275k(act, userCardMedalAndNameView.f5468l, userCardMedalAndNameView.f5469m, userCardMedalAndNameView.f5470n, userCardMedalAndNameView.f5471o, userCardMedalAndNameView.f5472p);
        } else {
            Act act2 = act();
            UserCardMedalAndNameView userCardMedalAndNameView2 = this.f15194c;
            w1tVar.m24275k(act2, userCardMedalAndNameView2.f5468l, userCardMedalAndNameView2.f5469m, userCardMedalAndNameView2.f5470n, userCardMedalAndNameView2.f5471o);
        }
        this.f15192a.m24288y(user);
        this.f15194c.f5457a.setText(user.name);
        this.f15194c.f5457a.setVisibility(0);
        this.f15194c.f5463g.setVisibility(0);
        boolean zB2 = vdt.b(2);
        UserCardMedalAndNameView userCardMedalAndNameView3 = this.f15194c;
        if (zB2) {
            userCardMedalAndNameView3.f5465i.setText(String.valueOf(user.age));
            this.f15194c.f5465i.setCompoundDrawablesWithIntrinsicBounds(TEnum.equals(user.gender, "male") ? i3c0.f12684W5 : i3c0.f12662U5, 0, 0, 0);
            this.f15194c.f5465i.setCompoundDrawablePadding(t100.a);
            this.f15194c.f5465i.setBackground(fce.b(TEnum.equals(user.gender, "male") ? -12664075 : -30235, t100.d(4.0f)));
            xdl0.M(this.f15194c.f5465i, !user.isHideAgeFromSVip());
        } else {
            userCardMedalAndNameView3.f5458b.setText(String.valueOf(user.age));
            this.f15194c.f5459c.setBackground(kvc0.b(TEnum.equals(user.gender, "male") ? i3c0.f12503G8 : i3c0.f12479E8));
            xdl0.M(this.f15194c.f5458b, !user.isHideAgeFromSVip());
        }
        this.f15194c.f5464h.setText(i0g0.j0(user.profile.zodiac));
        this.f15194c.f5464h.setVisibility(0);
        m17652l(user);
        m17653m(user, this.f15193b.m19189l4());
    }

    /* JADX INFO: renamed from: k */
    public void m17651k(mqv<User> mqvVar) {
        if (!d1t.a(mqvVar).d()) {
            m17650j(mqvVar != null ? (User) mqvVar.a : null);
            return;
        }
        this.f15194c.f5460d.setVisibility(8);
        this.f15194c.f5463g.setVisibility(8);
        this.f15194c.f5457a.setVisibility(0);
        this.f15194c.f5457a.setText(mqvVar.g().a.name);
    }

    /* JADX INFO: renamed from: l */
    public final void m17652l(User user) {
        xdl0.M(this.f15194c.f5460d, true);
        this.f15194c.f5462f.setText(this.f15193b.m19188k4(user, x8u.c(user.profile.followships.counters.followers), i0g0.p(user.location.distance, true), user.location.region.city));
    }

    /* JADX INFO: renamed from: m */
    public final void m17653m(final User user, boolean z) {
        if (TextUtils.isEmpty(user.publicId)) {
            this.f15194c.f5461e.setText("");
            return;
        }
        if (z) {
            Drawable drawable = act().getResources().getDrawable(i3c0.f12467D8);
            drawable.setBounds(0, 0, t100.p, t100.j);
            this.f15194c.f5461e.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f15194c.f5461e.setCompoundDrawablePadding(t100.e);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s  ·  ", user.publicId));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#AA7C38")), 0, user.publicId.length(), 34);
            this.f15194c.f5461e.setText(spannableStringBuilder);
        } else {
            this.f15194c.f5461e.setText(String.format("ID:%s  ·  ", user.publicId));
            this.f15194c.f5461e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        xdl0.E0(this.f15194c.f5461e, new View.OnClickListener() { // from class: l.i0k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m0k0.m17641a(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m17654n(p1k0 p1k0Var) {
        List list = p1k0Var.m19973m().hierarchy;
        if (vwb.J(list)) {
            return;
        }
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = (BLiveUserProfileConfigHierarchy) vwb.r(list, new w9j() { // from class: l.j0k0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserProfileConfigHierarchy) obj).type, "user"));
            }
        });
        if (!p1k0Var.m19973m().enableNewPrivilege || bLiveUserProfileConfigHierarchy == null || TextUtils.isEmpty(bLiveUserProfileConfigHierarchy.titleBackUrl)) {
            xdl0.M(this.f15194c.f5466j, false);
            return;
        }
        xdl0.M(this.f15194c.f5466j, true);
        this.f15194c.f5467k.setText(bLiveUserProfileConfigHierarchy.title);
        this.f15194c.f5467k.setTextColor(kvc0.h(bLiveUserProfileConfigHierarchy.titleColor, kvc0.a(h1c0.f11836w1)));
        m17647e(bLiveUserProfileConfigHierarchy.titleBackUrl);
    }
}
