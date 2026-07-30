package p002l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.tantan.library.svga.SVGALoader;
import l.gwr;
import l.t100;
import l.xdl0;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rgh0 extends if2 {

    /* JADX INFO: renamed from: c */
    public sgh0 f18508c;

    /* JADX INFO: renamed from: d */
    public SpecialSystemBulletView f18509d;

    public rgh0(sgh0 sgh0Var) {
        this.f18508c = sgh0Var;
    }

    @Override // p002l.if2
    /* JADX INFO: renamed from: i */
    public CharSequence mo15118i() {
        return this.f18508c.m22455c();
    }

    @Override // p002l.if2
    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder mo15121l() {
        return this.f18508c.m22461i();
    }

    @Override // p002l.if2
    /* JADX INFO: renamed from: m */
    public long mo15122m() {
        long displayDuration = this.f18508c.m22460h().getDisplayDuration();
        return displayDuration > 0 ? displayDuration : super.mo15122m();
    }

    @Override // p002l.if2
    /* JADX INFO: renamed from: o */
    public void mo15124o() {
        if (TextUtils.isEmpty(this.f18508c.m22460h().getGotoSchema())) {
            return;
        }
        ygt ygtVar = new ygt(this.f18508c.m22460h().getGotoSchema());
        zh3.m27375c(this.f18508c.m22460h().getType(), this.f18508c.m22460h().getId(), m15116g(), this.f13191b.mo21430R2(), "jumpRoom".equals(((gwr) ygtVar).a) ? ygtVar.g("roomId") : "", "jumpRoom".equals(((gwr) ygtVar).a) ? ygtVar.g("liveId") : "");
        this.f13191b.mo14197p3(3600, this.f18508c.m22460h().getGotoSchema());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView] */
    @Override // p002l.if2
    /* JADX INFO: renamed from: r */
    public void mo15127r(ViewGroup viewGroup, ei3 ei3Var) {
        if (this.f18508c.m22465m()) {
            SpecialSystemBulletView specialSystemBulletViewM12548b = ei3Var.m12548b(viewGroup);
            this.f18509d = specialSystemBulletViewM12548b;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) specialSystemBulletViewM12548b.f5505a.getLayoutParams();
            if (LongLinkGiftMessage.Alignment.Left.equals(this.f18508c.m22453a())) {
                layoutParams.gravity = 16;
                layoutParams.leftMargin = t100.d(8.0f);
            } else if (LongLinkGiftMessage.Alignment.Center.equals(this.f18508c.m22453a())) {
                layoutParams.gravity = 17;
                layoutParams.leftMargin = t100.d(10.0f);
            }
            this.f18509d.f5505a.setLayoutParams(layoutParams);
            viewGroup.addView(this.f18509d);
            m15114e(this.f18509d);
            this.f18509d.m6918s(this.f18508c);
        } else {
            ?? M12547a = ei3Var.m12547a(BulletType.DEFAULT_BULLET_STYLE, viewGroup);
            viewGroup.addView(M12547a);
            M12547a.m6916i0(this.f18508c);
            m15113d(M12547a);
        }
        ygt ygtVar = new ygt(this.f18508c.m22460h().getGotoSchema());
        zh3.m27376d(this.f18508c.m22460h().getType(), this.f18508c.m22460h().getId(), m15116g(), this.f13191b.mo21430R2(), "jumpRoom".equals(((gwr) ygtVar).a) ? ygtVar.g("roomId") : "", "jumpRoom".equals(((gwr) ygtVar).a) ? ygtVar.g("liveId") : "");
    }

    @Override // p002l.if2
    /* JADX INFO: renamed from: s */
    public void mo15128s() {
        SpecialSystemBulletView specialSystemBulletView;
        if (TextUtils.isEmpty(this.f18508c.m22456d()) || (specialSystemBulletView = this.f18509d) == null) {
            return;
        }
        xdl0.D0(specialSystemBulletView.f5505a.getWidth(), new View[]{this.f18509d.f5512h});
        SVGALoader.with(this.f18509d.getContext()).from(this.f18508c.m22456d()).repeatCount(-1).autoPlay(true).into(this.f18509d.f5512h);
    }

    /* JADX INFO: renamed from: t */
    public sgh0 m21922t() {
        return this.f18508c;
    }
}
