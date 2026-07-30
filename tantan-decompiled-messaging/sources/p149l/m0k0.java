package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class m0k0<D extends ho2> implements s7m<o0k0<D>> {

    /* JADX INFO: renamed from: a */
    public final w1t f130742a = new w1t(true);

    /* JADX INFO: renamed from: b */
    public o0k0<D> f130743b;

    /* JADX INFO: renamed from: c */
    public UserCardMedalAndNameView f130744c;

    /* JADX INFO: renamed from: d */
    public DownloadTask f130745d;

    /* JADX INFO: renamed from: e */
    public Bitmap f130746e;

    public m0k0(UserCardMedalAndNameView userCardMedalAndNameView) {
        this.f130744c = userCardMedalAndNameView;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m152508a(User user, View view) {
        lsi0.m151595y("ID已复制");
        m95.m153590c(view.getContext()).m153591a("tantan userID", user.publicId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m152511f(File file) {
        this.f130746e = bk40.m102268h(this.f130744c.f49424j, file);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f130744c.f49415a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(o0k0<D> o0k0Var) {
        this.f130743b = o0k0Var;
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f130744c.f49424j.setBackground(getContext().getDrawable(i3c0.f110838R));
        xdl0.m208344M(this.f130744c.f49424j, false);
        bk40.m102265e(this.f130746e, this.f130745d);
    }

    /* JADX INFO: renamed from: e */
    public void m152513e(String str) {
        File fileM102264d = bk40.m102264d(getContext(), str);
        if (fileM102264d.exists()) {
            m152514i(fileM102264d);
        } else {
            this.f130745d = bk40.m102266f(str, fileM102264d, new e30() { // from class: l.k0k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120495a.m152514i((File) obj);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m152514i(final File file) {
        xdl0.m208344M(this.f130744c.f49424j, true);
        e51.m114742G(new Runnable() { // from class: l.l0k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f125549a.m152511f(file);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m152515j(User user) {
        if (user == null) {
            this.f130744c.f49415a.setVisibility(8);
            this.f130744c.f49418d.setVisibility(8);
            this.f130744c.f49421g.setVisibility(8);
            return;
        }
        boolean zM198092b = vdt.m198092b(2);
        w1t w1tVar = this.f130742a;
        if (zM198092b) {
            Act act = getAct();
            UserCardMedalAndNameView userCardMedalAndNameView = this.f130744c;
            w1tVar.m200966k(act, userCardMedalAndNameView.f49426l, userCardMedalAndNameView.f49427m, userCardMedalAndNameView.f49428n, userCardMedalAndNameView.f49429o, userCardMedalAndNameView.f49430p);
        } else {
            Act act2 = getAct();
            UserCardMedalAndNameView userCardMedalAndNameView2 = this.f130744c;
            w1tVar.m200966k(act2, userCardMedalAndNameView2.f49426l, userCardMedalAndNameView2.f49427m, userCardMedalAndNameView2.f49428n, userCardMedalAndNameView2.f49429o);
        }
        this.f130742a.m200979y(user);
        this.f130744c.f49415a.setText(user.name);
        this.f130744c.f49415a.setVisibility(0);
        this.f130744c.f49421g.setVisibility(0);
        boolean zM198092b2 = vdt.m198092b(2);
        UserCardMedalAndNameView userCardMedalAndNameView3 = this.f130744c;
        if (zM198092b2) {
            userCardMedalAndNameView3.f49423i.setText(String.valueOf(user.age));
            this.f130744c.f49423i.setCompoundDrawablesWithIntrinsicBounds(TEnum.equals(user.gender, "male") ? i3c0.f110899W5 : i3c0.f110877U5, 0, 0, 0);
            this.f130744c.f49423i.setCompoundDrawablePadding(t100.f167252a);
            this.f130744c.f49423i.setBackground(fce.m120425b(TEnum.equals(user.gender, "male") ? -12664075 : -30235, t100.m186890d(4.0f)));
            xdl0.m208344M(this.f130744c.f49423i, !user.isHideAgeFromSVip());
        } else {
            userCardMedalAndNameView3.f49416b.setText(String.valueOf(user.age));
            this.f130744c.f49417c.setBackground(kvc0.m147353b(TEnum.equals(user.gender, "male") ? i3c0.f110718G8 : i3c0.f110694E8));
            xdl0.m208344M(this.f130744c.f49416b, !user.isHideAgeFromSVip());
        }
        this.f130744c.f49422h.setText(i0g0.m133869j0(user.profile.zodiac));
        this.f130744c.f49422h.setVisibility(0);
        m152517l(user);
        m152518m(user, this.f130743b.m162154l4());
    }

    /* JADX INFO: renamed from: k */
    public void m152516k(mqv<User> mqvVar) {
        if (!d1t.m109678a(mqvVar).m109681d()) {
            m152515j(mqvVar != null ? mqvVar.f135304a : null);
            return;
        }
        this.f130744c.f49418d.setVisibility(8);
        this.f130744c.f49421g.setVisibility(8);
        this.f130744c.f49415a.setVisibility(0);
        this.f130744c.f49415a.setText(((d1t) mqvVar.m156004g()).f83297a.name);
    }

    /* JADX INFO: renamed from: l */
    public final void m152517l(User user) {
        xdl0.m208344M(this.f130744c.f49418d, true);
        this.f130744c.f49420f.setText(this.f130743b.m162153k4(user, x8u.m207433c(user.profile.followships.counters.followers), i0g0.m133876p(user.location.distance, true), user.location.region.city));
    }

    /* JADX INFO: renamed from: m */
    public final void m152518m(final User user, boolean z) {
        if (TextUtils.isEmpty(user.publicId)) {
            this.f130744c.f49419e.setText("");
            return;
        }
        if (z) {
            Drawable drawable = getAct().getResources().getDrawable(i3c0.f110682D8);
            drawable.setBounds(0, 0, t100.f167267p, t100.f167261j);
            this.f130744c.f49419e.setCompoundDrawables(drawable, null, null, null);
            this.f130744c.f49419e.setCompoundDrawablePadding(t100.f167256e);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s  ·  ", user.publicId));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#AA7C38")), 0, user.publicId.length(), 34);
            this.f130744c.f49419e.setText(spannableStringBuilder);
        } else {
            this.f130744c.f49419e.setText(String.format("ID:%s  ·  ", user.publicId));
            this.f130744c.f49419e.setCompoundDrawables(null, null, null, null);
        }
        xdl0.m208329E0(this.f130744c.f49419e, new View.OnClickListener() { // from class: l.i0k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m0k0.m152508a(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m152519n(p1k0 p1k0Var) {
        List<BLiveUserProfileConfigHierarchy> list = p1k0Var.m167093m().hierarchy;
        if (vwb.m200296J(list)) {
            return;
        }
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = (BLiveUserProfileConfigHierarchy) vwb.m200346r(list, new w9j() { // from class: l.j0k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserProfileConfigHierarchy) obj).type, "user"));
            }
        });
        if (!p1k0Var.m167093m().enableNewPrivilege || bLiveUserProfileConfigHierarchy == null || TextUtils.isEmpty(bLiveUserProfileConfigHierarchy.titleBackUrl)) {
            xdl0.m208344M(this.f130744c.f49424j, false);
            return;
        }
        xdl0.m208344M(this.f130744c.f49424j, true);
        this.f130744c.f49425k.setText(bLiveUserProfileConfigHierarchy.title);
        this.f130744c.f49425k.setTextColor(kvc0.m147359h(bLiveUserProfileConfigHierarchy.titleColor, kvc0.m147352a(h1c0.f105416w1)));
        m152513e(bLiveUserProfileConfigHierarchy.titleBackUrl);
    }
}
