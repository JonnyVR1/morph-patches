package p153l;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveDefaultBulletView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveSpecialSystemBulletView;

/* JADX INFO: loaded from: classes5.dex */
public class h5o0 extends iun0 {

    /* JADX INFO: renamed from: b */
    public i5o0 f107955b;

    /* JADX INFO: renamed from: c */
    public VoiceLiveSpecialSystemBulletView f107956c;

    /* JADX INFO: renamed from: l.h5o0$a */
    public class C17404a extends fn2 {

        /* JADX INFO: renamed from: l.h5o0$a$a */
        public class a extends ye2 {

            /* JADX INFO: renamed from: a */
            public int f107958a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f107959b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ wp0 f107960c;

            public a(int i, wp0 wp0Var) {
                this.f107959b = i;
                this.f107960c = wp0Var;
            }

            @Override // p153l.ye2, p153l.lr0
            /* JADX INFO: renamed from: a */
            public void mo77568a(@NonNull Drawable drawable, int i) {
                int i2 = this.f107958a;
                if ((i2 != 0 || this.f107959b > 1) && i2 <= i) {
                    this.f107958a = i;
                } else {
                    this.f107960c.stop();
                }
            }

            @Override // p153l.ye2, p153l.lr0
            public void onAnimationStart(@NonNull Drawable drawable) {
                this.f107958a = -1;
            }
        }

        public C17404a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (animatable instanceof wp0) {
                wp0 wp0Var = (wp0) animatable;
                wp0Var.m207396j(new a(wp0Var.m207391e(), wp0Var));
            }
        }
    }

    public h5o0(i5o0 i5o0Var) {
        this.f107955b = i5o0Var;
    }

    @Override // p153l.iun0
    /* JADX INFO: renamed from: f */
    public CharSequence mo133662f() {
        return this.f107955b.m138753c();
    }

    @Override // p153l.iun0
    /* JADX INFO: renamed from: h */
    public long mo133663h() {
        long displayDuration = this.f107955b.m138758h().getDisplayDuration();
        return displayDuration > 0 ? displayDuration : super.mo133663h();
    }

    @Override // p153l.iun0
    /* JADX INFO: renamed from: j */
    public void mo133664j() {
        if (TextUtils.isEmpty(this.f107955b.m138758h().getGotoSchema())) {
            return;
        }
        zit zitVar = new zit(this.f107955b.m138758h().getGotoSchema());
        if (TextUtils.equals(zitVar.f112154a, "jumpRoom") && zitVar.m219938h(this.f107955b.m138758h().getGotoSchema())) {
            m133667m(zitVar);
        } else {
            this.f116963a.mo138869p3(7004, this.f107955b.m138758h().getGotoSchema());
        }
    }

    @Override // p153l.iun0
    /* JADX INFO: renamed from: k */
    public void mo133665k(ViewGroup viewGroup, evn0 evn0Var) {
        if (!this.f107955b.m138762l()) {
            VoiceLiveDefaultBulletView voiceLiveDefaultBulletViewM122801a = evn0Var.m122801a(VoiceLiveBulletType.DEFAULT_BULLET_STYLE, viewGroup);
            viewGroup.addView(voiceLiveDefaultBulletViewM122801a);
            voiceLiveDefaultBulletViewM122801a.m79393i0(this.f107955b);
            m142199a(voiceLiveDefaultBulletViewM122801a);
            return;
        }
        VoiceLiveSpecialSystemBulletView voiceLiveSpecialSystemBulletViewM122802b = evn0Var.m122802b(viewGroup);
        this.f107956c = voiceLiveSpecialSystemBulletViewM122802b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) voiceLiveSpecialSystemBulletViewM122802b.f54068a.getLayoutParams();
        if (LongLinkGiftMessage.Alignment.Left.equals(this.f107955b.m138751a())) {
            layoutParams.gravity = 16;
            layoutParams.leftMargin = qa00.m175859d(8.0f);
        } else if (LongLinkGiftMessage.Alignment.Center.equals(this.f107955b.m138751a())) {
            layoutParams.gravity = 17;
            layoutParams.leftMargin = qa00.m175859d(10.0f);
        }
        this.f107956c.f54068a.setLayoutParams(layoutParams);
        viewGroup.addView(this.f107956c);
        m142200b(this.f107956c);
        this.f107956c.m79395s(this.f107955b);
    }

    @Override // p153l.iun0
    /* JADX INFO: renamed from: l */
    public void mo133666l() {
        VoiceLiveSpecialSystemBulletView voiceLiveSpecialSystemBulletView;
        if (TextUtils.isEmpty(this.f107955b.m138754d()) || (voiceLiveSpecialSystemBulletView = this.f107956c) == null) {
            return;
        }
        bnl0.m105507D0(voiceLiveSpecialSystemBulletView.f54068a.getWidth(), this.f107956c.f54075h);
        r230.C19750j c19750j = new r230.C19750j("context_livingAct");
        c19750j.m179524l(false);
        c19750j.mo179511b(this.f107955b.m138754d());
        c19750j.m179526n(new C17404a());
        c19750j.mo179504k().m179484E(this.f107956c.f54075h);
    }

    /* JADX INFO: renamed from: m */
    public final void m133667m(zit zitVar) {
        if (m142205i()) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47647L0));
            return;
        }
        if ("hour_leaderboard_comments_msg".equals(this.f107955b.m138758h().getType())) {
            v1n0.m199035m();
        }
        if ((m142202d() instanceof rwn0) && guk0.m132329h(((rwn0) m142202d()).m183423Y2())) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47832Th));
        } else if (m142202d().m202194o().equals(zitVar.m219937g("roomId"))) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47987b3));
        } else {
            this.f116963a.m217460Z3(zitVar.m219937g("liveId"), this.f107955b.m138758h().getGotoSchema());
        }
    }

    /* JADX INFO: renamed from: n */
    public i5o0 m133668n() {
        return this.f107955b;
    }
}
