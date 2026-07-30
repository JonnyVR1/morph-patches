package p149l;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveDefaultBulletView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveSpecialSystemBulletView;

/* JADX INFO: loaded from: classes5.dex */
public class dwn0 extends eln0 {

    /* JADX INFO: renamed from: b */
    public ewn0 f88187b;

    /* JADX INFO: renamed from: c */
    public VoiceLiveSpecialSystemBulletView f88188c;

    /* JADX INFO: renamed from: l.dwn0$a */
    public class C16488a extends ym2 {

        /* JADX INFO: renamed from: l.dwn0$a$a */
        public class a extends qe2 {

            /* JADX INFO: renamed from: a */
            public int f88190a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f88191b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ aq0 f88192c;

            public a(int i, aq0 aq0Var) {
                this.f88191b = i;
                this.f88192c = aq0Var;
            }

            @Override // p149l.qe2, p149l.hr0
            /* JADX INFO: renamed from: a */
            public void mo76385a(@NonNull Drawable drawable, int i) {
                int i2 = this.f88190a;
                if ((i2 != 0 || this.f88191b > 1) && i2 <= i) {
                    this.f88190a = i;
                } else {
                    this.f88192c.stop();
                }
            }

            @Override // p149l.qe2, p149l.hr0
            public void onAnimationStart(@NonNull Drawable drawable) {
                this.f88190a = -1;
            }
        }

        public C16488a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (animatable instanceof aq0) {
                aq0 aq0Var = (aq0) animatable;
                aq0Var.m98214j(new a(aq0Var.m98209e(), aq0Var));
            }
        }
    }

    public dwn0(ewn0 ewn0Var) {
        this.f88187b = ewn0Var;
    }

    @Override // p149l.eln0
    /* JADX INFO: renamed from: f */
    public CharSequence mo113892f() {
        return this.f88187b.m118476c();
    }

    @Override // p149l.eln0
    /* JADX INFO: renamed from: h */
    public long mo113893h() {
        long displayDuration = this.f88187b.m118481h().getDisplayDuration();
        return displayDuration > 0 ? displayDuration : super.mo113893h();
    }

    @Override // p149l.eln0
    /* JADX INFO: renamed from: j */
    public void mo113894j() {
        if (TextUtils.isEmpty(this.f88187b.m118481h().getGotoSchema())) {
            return;
        }
        ygt ygtVar = new ygt(this.f88187b.m118481h().getGotoSchema());
        if (TextUtils.equals(ygtVar.f104769a, "jumpRoom") && ygtVar.m214764h(this.f88187b.m118481h().getGotoSchema())) {
            m113897m(ygtVar);
        } else {
            this.f92131a.mo129310p3(7004, this.f88187b.m118481h().getGotoSchema());
        }
    }

    @Override // p149l.eln0
    /* JADX INFO: renamed from: k */
    public void mo113895k(ViewGroup viewGroup, amn0 amn0Var) {
        if (!this.f88187b.m118485l()) {
            VoiceLiveDefaultBulletView voiceLiveDefaultBulletViewM97562a = amn0Var.m97562a(VoiceLiveBulletType.DEFAULT_BULLET_STYLE, viewGroup);
            viewGroup.addView(voiceLiveDefaultBulletViewM97562a);
            voiceLiveDefaultBulletViewM97562a.m78210i0(this.f88187b);
            m117143a(voiceLiveDefaultBulletViewM97562a);
            return;
        }
        VoiceLiveSpecialSystemBulletView voiceLiveSpecialSystemBulletViewM97563b = amn0Var.m97563b(viewGroup);
        this.f88188c = voiceLiveSpecialSystemBulletViewM97563b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) voiceLiveSpecialSystemBulletViewM97563b.f53220a.getLayoutParams();
        if (LongLinkGiftMessage.Alignment.Left.equals(this.f88187b.m118474a())) {
            layoutParams.gravity = 16;
            layoutParams.leftMargin = t100.m186890d(8.0f);
        } else if (LongLinkGiftMessage.Alignment.Center.equals(this.f88187b.m118474a())) {
            layoutParams.gravity = 17;
            layoutParams.leftMargin = t100.m186890d(10.0f);
        }
        this.f88188c.f53220a.setLayoutParams(layoutParams);
        viewGroup.addView(this.f88188c);
        m117144b(this.f88188c);
        this.f88188c.m78212s(this.f88187b);
    }

    @Override // p149l.eln0
    /* JADX INFO: renamed from: l */
    public void mo113896l() {
        VoiceLiveSpecialSystemBulletView voiceLiveSpecialSystemBulletView;
        if (TextUtils.isEmpty(this.f88187b.m118477d()) || (voiceLiveSpecialSystemBulletView = this.f88188c) == null) {
            return;
        }
        xdl0.m208327D0(voiceLiveSpecialSystemBulletView.f53220a.getWidth(), this.f88188c.f53227h);
        hu20.C17405j c17405j = new hu20.C17405j("context_livingAct");
        c17405j.m133019l(false);
        c17405j.mo133006b(this.f88187b.m118477d());
        c17405j.m133021n(new C16488a());
        c17405j.mo132999k().m132979E(this.f88188c.f53227h);
    }

    /* JADX INFO: renamed from: m */
    public final void m113897m(ygt ygtVar) {
        if (m117149i()) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46799L0));
            return;
        }
        if ("hour_leaderboard_comments_msg".equals(this.f88187b.m118481h().getType())) {
            rsm0.m180705m();
        }
        if ((m117146d() instanceof nnn0) && alk0.m97309h(((nnn0) m117146d()).m160261Y2())) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46984Th));
        } else if (m117146d().m149818o().equals(ygtVar.m214763g("roomId"))) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f47139b3));
        } else {
            this.f92131a.m194253Z3(ygtVar.m214763g("liveId"), this.f88187b.m118481h().getGotoSchema());
        }
    }

    /* JADX INFO: renamed from: n */
    public ewn0 m113898n() {
        return this.f88187b;
    }
}
