package p149l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.C0222a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.page.profile.myroomnew.view.MultipleAvatarView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ow10 implements s7m<jw10> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f145901a;

    /* JADX INFO: renamed from: b */
    public VText f145902b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f145903c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f145904d;

    /* JADX INFO: renamed from: e */
    public MultipleAvatarView f145905e;

    /* JADX INFO: renamed from: f */
    public VText f145906f;

    /* JADX INFO: renamed from: g */
    public VText f145907g;

    /* JADX INFO: renamed from: h */
    public VText f145908h;

    /* JADX INFO: renamed from: i */
    public VText f145909i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f145910j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f145911k;

    /* JADX INFO: renamed from: l */
    public View f145912l;

    /* JADX INFO: renamed from: m */
    public View f145913m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f145914n;

    /* JADX INFO: renamed from: o */
    public VText f145915o;

    /* JADX INFO: renamed from: p */
    public VText f145916p;

    /* JADX INFO: renamed from: q */
    public e30<BLiveRoomInProfile> f145917q;

    /* JADX INFO: renamed from: r */
    public e30<BLiveVoiceRoomInProfile> f145918r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f145919s;

    /* JADX INFO: renamed from: t */
    public ObjectAnimator f145920t;

    /* JADX INFO: renamed from: l.ow10$a */
    public class C19054a extends ap0 {
        public C19054a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: d */
        public void mo70529d(@NonNull wo0 wo0Var) {
            super.mo70529d(wo0Var);
            ow10.this.f145904d.postDelayed(new Runnable() { // from class: l.nw10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140863a.m166230j();
                }
            }, 1000L);
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m166230j() {
            ow10 ow10Var = ow10.this;
            AnimEffectPlayer animEffectPlayer = ow10Var.f145904d;
            ow10Var.f145919s = ObjectAnimator.ofFloat(animEffectPlayer, "TranslationY", 0.0f, animEffectPlayer.getHeight()).setDuration(7000L);
            ow10.this.f145919s.setRepeatCount(-1);
            ow10.this.f145919s.setRepeatMode(2);
            ow10.this.f145919s.start();
        }
    }

    /* JADX INFO: renamed from: l.ow10$b */
    public class C19055b extends ym2 {
        public C19055b() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            ow10 ow10Var = ow10.this;
            ow10Var.m166220j(ow10Var.f145911k, ngmVar.getWidth(), ngmVar.getHeight());
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getAct();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (Act) xdl0.m208328E(this.f145901a);
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f145904d.clearAnimation();
        ObjectAnimator objectAnimator = this.f145920t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f145919s;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public View m166219i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pw10.m171702b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m166219i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m166220j(VDraweeView vDraweeView, int i, final int i2) {
        C0222a c0222a = new C0222a();
        c0222a.m1148c(this.f145910j);
        c0222a.m1152g(vDraweeView.getId(), i2);
        c0222a.m1146a(this.f145910j);
        this.f145911k.postDelayed(new Runnable() { // from class: l.mw10
            @Override // java.lang.Runnable
            public final void run() {
                this.f136008a.m166223m(i2);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: l */
    public void m166222l(boolean z) {
        ConstraintLayout constraintLayout = this.f145901a;
        if (constraintLayout != null) {
            xdl0.m208344M(constraintLayout, !z);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m166223m(int i) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f145911k, "TranslationY", 0.0f, i - this.f145910j.getHeight()).setDuration(8000L);
        this.f145920t = duration;
        duration.setRepeatCount(-1);
        this.f145920t.setRepeatMode(2);
        this.f145920t.start();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m166224n(BLiveRoomInProfile bLiveRoomInProfile, View view) {
        e30<BLiveRoomInProfile> e30Var = this.f145917q;
        if (e30Var != null) {
            e30Var.call(bLiveRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m166225p(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile, View view) {
        e30<BLiveVoiceRoomInProfile> e30Var = this.f145918r;
        if (e30Var != null) {
            e30Var.call(bLiveVoiceRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m166226q(final BLiveRoomInProfile bLiveRoomInProfile) {
        mep0.m154302d1(this.f145910j, t100.f167260i);
        hxs.m133410w("context_square", this.f145911k, bLiveRoomInProfile.background, new C19055b());
        hxs.m133406s("context_square", this.f145914n, bLiveRoomInProfile.anchorAvatar);
        this.f145915o.setText(bLiveRoomInProfile.title);
        this.f145916p.setText(bLiveRoomInProfile.subTitle);
        xdl0.m208329E0(this.f145910j, new View.OnClickListener() { // from class: l.kw10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124914a.m166224n(bLiveRoomInProfile, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m166227s(j760<BLiveRoomInProfile, BLiveVoiceRoomInProfile> j760Var, e30<BLiveRoomInProfile> e30Var, e30<BLiveVoiceRoomInProfile> e30Var2, String str) {
        this.f145902b.setTextColor(-14606047);
        this.f145901a.setBackgroundColor(-1);
        this.f145902b.setTypeface(Typeface.SANS_SERIF, 1);
        this.f145902b.setText(s9s.f163228b.m195720R4());
        if (j760Var.f116564a == null && j760Var.f116565b == null) {
            this.f145901a.setVisibility(8);
            return;
        }
        this.f145901a.setVisibility(0);
        BLiveRoomInProfile bLiveRoomInProfile = j760Var.f116564a;
        if (bLiveRoomInProfile != null) {
            c6j0.m105479e(false, bLiveRoomInProfile.anchorId, bLiveRoomInProfile.liveId, bLiveRoomInProfile.status, bLiveRoomInProfile.multiCallInfo.role, str);
            m166226q(j760Var.f116564a);
        } else {
            this.f145910j.setVisibility(8);
        }
        BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile = j760Var.f116565b;
        if (bLiveVoiceRoomInProfile != null) {
            c6j0.m105482h(true, bLiveVoiceRoomInProfile.anchorId, bLiveVoiceRoomInProfile.voiceLiveId, false, bLiveVoiceRoomInProfile.topicId, true);
            m166228u(j760Var.f116565b, j760Var.f116564a == null);
        } else {
            this.f145903c.setVisibility(8);
        }
        this.f145917q = e30Var;
        this.f145918r = e30Var2;
    }

    /* JADX INFO: renamed from: u */
    public final void m166228u(final BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile, boolean z) {
        this.f145903c.setVisibility(0);
        mep0.m154302d1(this.f145903c, t100.f167260i);
        this.f145908h.setVisibility(z ? 0 : 8);
        this.f145909i.setVisibility(bLiveVoiceRoomInProfile.isPersonal ? 0 : 8);
        this.f145906f.setText(bLiveVoiceRoomInProfile.title);
        if (z || !bLiveVoiceRoomInProfile.needBuild) {
            this.f145907g.setText(bLiveVoiceRoomInProfile.subTitle);
            this.f145908h.setText(bLiveVoiceRoomInProfile.membersText);
        } else {
            this.f145907g.setText(bLiveVoiceRoomInProfile.membersText);
            VText vText = this.f145907g;
            vText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, vText.getResources().getDrawable(h3c0.f105652a0), (Drawable) null);
            this.f145907g.setGravity(17);
        }
        if (bLiveVoiceRoomInProfile.needBuild) {
            VText vText2 = this.f145908h;
            vText2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, vText2.getResources().getDrawable(h3c0.f105652a0), (Drawable) null);
        }
        this.f145905e.setRadius(48.0f);
        this.f145905e.m70559p0(bLiveVoiceRoomInProfile.userAvatars, false);
        this.f145904d.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f145904d.mo68497g(bLiveVoiceRoomInProfile.background, -1, new C19054a(), true);
        xdl0.m208329E0(this.f145903c, new View.OnClickListener() { // from class: l.lw10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130234a.m166225p(bLiveVoiceRoomInProfile, view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jw10 jw10Var) {
    }
}
