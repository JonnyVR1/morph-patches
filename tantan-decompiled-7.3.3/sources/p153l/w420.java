package p153l;

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
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.page.profile.myroomnew.view.MultipleAvatarView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class w420 implements iam<r420> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f187201a;

    /* JADX INFO: renamed from: b */
    public VText f187202b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f187203c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f187204d;

    /* JADX INFO: renamed from: e */
    public MultipleAvatarView f187205e;

    /* JADX INFO: renamed from: f */
    public VText f187206f;

    /* JADX INFO: renamed from: g */
    public VText f187207g;

    /* JADX INFO: renamed from: h */
    public VText f187208h;

    /* JADX INFO: renamed from: i */
    public VText f187209i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f187210j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f187211k;

    /* JADX INFO: renamed from: l */
    public View f187212l;

    /* JADX INFO: renamed from: m */
    public View f187213m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f187214n;

    /* JADX INFO: renamed from: o */
    public VText f187215o;

    /* JADX INFO: renamed from: p */
    public VText f187216p;

    /* JADX INFO: renamed from: q */
    public y20<BLiveRoomInProfile> f187217q;

    /* JADX INFO: renamed from: r */
    public y20<BLiveVoiceRoomInProfile> f187218r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f187219s;

    /* JADX INFO: renamed from: t */
    public ObjectAnimator f187220t;

    /* JADX INFO: renamed from: l.w420$a */
    public class C21010a extends wo0 {
        public C21010a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: d */
        public void mo71712d(@NonNull so0 so0Var) {
            super.mo71712d(so0Var);
            w420.this.f187204d.postDelayed(new Runnable() { // from class: l.v420
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182329a.m204817j();
                }
            }, 1000L);
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m204817j() {
            w420 w420Var = w420.this;
            AnimEffectPlayer animEffectPlayer = w420Var.f187204d;
            w420Var.f187219s = ObjectAnimator.ofFloat(animEffectPlayer, "TranslationY", 0.0f, animEffectPlayer.getHeight()).setDuration(7000L);
            w420.this.f187219s.setRepeatCount(-1);
            w420.this.f187219s.setRepeatMode(2);
            w420.this.f187219s.start();
        }
    }

    /* JADX INFO: renamed from: l.w420$b */
    public class C21011b extends fn2 {
        public C21011b() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            w420 w420Var = w420.this;
            w420Var.m204807j(w420Var.f187211k, qimVar.getWidth(), qimVar.getHeight());
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getAct();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (Act) bnl0.m105508E(this.f187201a);
    }

    @Override // p153l.iam
    public void destroy() {
        this.f187204d.clearAnimation();
        ObjectAnimator objectAnimator = this.f187220t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f187219s;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public View m204806i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x420.m209298b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m204806i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m204807j(VDraweeView vDraweeView, int i, final int i2) {
        C0223a c0223a = new C0223a();
        c0223a.m1149c(this.f187210j);
        c0223a.m1153g(vDraweeView.getId(), i2);
        c0223a.m1147a(this.f187210j);
        this.f187211k.postDelayed(new Runnable() { // from class: l.u420
            @Override // java.lang.Runnable
            public final void run() {
                this.f177425a.m204810m(i2);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: l */
    public void m204809l(boolean z) {
        ConstraintLayout constraintLayout = this.f187201a;
        if (constraintLayout != null) {
            bnl0.m105524M(constraintLayout, !z);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m204810m(int i) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f187211k, "TranslationY", 0.0f, i - this.f187210j.getHeight()).setDuration(8000L);
        this.f187220t = duration;
        duration.setRepeatCount(-1);
        this.f187220t.setRepeatMode(2);
        this.f187220t.start();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m204811n(BLiveRoomInProfile bLiveRoomInProfile, View view) {
        y20<BLiveRoomInProfile> y20Var = this.f187217q;
        if (y20Var != null) {
            y20Var.call(bLiveRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m204812p(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile, View view) {
        y20<BLiveVoiceRoomInProfile> y20Var = this.f187218r;
        if (y20Var != null) {
            y20Var.call(bLiveVoiceRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m204813q(final BLiveRoomInProfile bLiveRoomInProfile) {
        qnp0.m177261d1(this.f187210j, qa00.f156322i);
        izs.m142872w("context_square", this.f187211k, bLiveRoomInProfile.background, new C21011b());
        izs.m142868s("context_square", this.f187214n, bLiveRoomInProfile.anchorAvatar);
        this.f187215o.setText(bLiveRoomInProfile.title);
        this.f187216p.setText(bLiveRoomInProfile.subTitle);
        bnl0.m105509E0(this.f187210j, new View.OnClickListener() { // from class: l.s420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166150a.m204811n(bLiveRoomInProfile, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m204814s(pf60<BLiveRoomInProfile, BLiveVoiceRoomInProfile> pf60Var, y20<BLiveRoomInProfile> y20Var, y20<BLiveVoiceRoomInProfile> y20Var2, String str) {
        this.f187202b.setTextColor(-14606047);
        this.f187201a.setBackgroundColor(-1);
        this.f187202b.setTypeface(Typeface.SANS_SERIF, 1);
        this.f187202b.setText(tbs.f172989b.m203507R4());
        if (pf60Var.f152156a == null && pf60Var.f152157b == null) {
            this.f187201a.setVisibility(8);
            return;
        }
        this.f187201a.setVisibility(0);
        BLiveRoomInProfile bLiveRoomInProfile = pf60Var.f152156a;
        if (bLiveRoomInProfile != null) {
            gfj0.m130077e(false, bLiveRoomInProfile.anchorId, bLiveRoomInProfile.liveId, bLiveRoomInProfile.status, bLiveRoomInProfile.multiCallInfo.role, str);
            m204813q(pf60Var.f152156a);
        } else {
            this.f187210j.setVisibility(8);
        }
        BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile = pf60Var.f152157b;
        if (bLiveVoiceRoomInProfile != null) {
            gfj0.m130080h(true, bLiveVoiceRoomInProfile.anchorId, bLiveVoiceRoomInProfile.voiceLiveId, false, bLiveVoiceRoomInProfile.topicId, true);
            m204815u(pf60Var.f152157b, pf60Var.f152156a == null);
        } else {
            this.f187203c.setVisibility(8);
        }
        this.f187217q = y20Var;
        this.f187218r = y20Var2;
    }

    /* JADX INFO: renamed from: u */
    public final void m204815u(final BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile, boolean z) {
        this.f187203c.setVisibility(0);
        qnp0.m177261d1(this.f187203c, qa00.f156322i);
        this.f187208h.setVisibility(z ? 0 : 8);
        this.f187209i.setVisibility(bLiveVoiceRoomInProfile.isPersonal ? 0 : 8);
        this.f187206f.setText(bLiveVoiceRoomInProfile.title);
        if (z || !bLiveVoiceRoomInProfile.needBuild) {
            this.f187207g.setText(bLiveVoiceRoomInProfile.subTitle);
            this.f187208h.setText(bLiveVoiceRoomInProfile.membersText);
        } else {
            this.f187207g.setText(bLiveVoiceRoomInProfile.membersText);
            VText vText = this.f187207g;
            vText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, vText.getResources().getDrawable(nbc0.f141143a0), (Drawable) null);
            this.f187207g.setGravity(17);
        }
        if (bLiveVoiceRoomInProfile.needBuild) {
            VText vText2 = this.f187208h;
            vText2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, vText2.getResources().getDrawable(nbc0.f141143a0), (Drawable) null);
        }
        this.f187205e.setRadius(48.0f);
        this.f187205e.m71742p0(bLiveVoiceRoomInProfile.userAvatars, false);
        this.f187204d.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f187204d.mo69680g(bLiveVoiceRoomInProfile.background, -1, new C21010a(), true);
        bnl0.m105509E0(this.f187203c, new View.OnClickListener() { // from class: l.t420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171971a.m204812p(bLiveVoiceRoomInProfile, view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(r420 r420Var) {
    }
}
