package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import com.tantan.library.svga.SVGALoader;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes4.dex */
public class rgh0 extends if2 {

    /* JADX INFO: renamed from: c */
    public sgh0 f159251c;

    /* JADX INFO: renamed from: d */
    public SpecialSystemBulletView f159252d;

    public rgh0(sgh0 sgh0Var) {
        this.f159251c = sgh0Var;
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: i */
    public CharSequence mo135870i() {
        return this.f159251c.m184072c();
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder mo135873l() {
        return this.f159251c.m184078i();
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: m */
    public long mo135874m() {
        long displayDuration = this.f159251c.m184077h().getDisplayDuration();
        return displayDuration > 0 ? displayDuration : super.mo135874m();
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: o */
    public void mo135876o() {
        if (TextUtils.isEmpty(this.f159251c.m184077h().getGotoSchema())) {
            return;
        }
        ygt ygtVar = new ygt(this.f159251c.m184077h().getGotoSchema());
        zh3.m218760c(this.f159251c.m184077h().getType(), this.f159251c.m184077h().getId(), m135868g(), this.f112955b.mo77274R2(), "jumpRoom".equals(ygtVar.f104769a) ? ygtVar.m214763g("roomId") : "", "jumpRoom".equals(ygtVar.f104769a) ? ygtVar.m214763g("liveId") : "");
        this.f112955b.mo129310p3(MMKV.ExpireInHour, this.f159251c.m184077h().getGotoSchema());
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: r */
    public void mo135879r(ViewGroup viewGroup, ei3 ei3Var) {
        if (this.f159251c.m184082m()) {
            SpecialSystemBulletView specialSystemBulletViewM116622b = ei3Var.m116622b(viewGroup);
            this.f159252d = specialSystemBulletViewM116622b;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) specialSystemBulletViewM116622b.f49463a.getLayoutParams();
            if (LongLinkGiftMessage.Alignment.Left.equals(this.f159251c.m184070a())) {
                layoutParams.gravity = 16;
                layoutParams.leftMargin = t100.m186890d(8.0f);
            } else if (LongLinkGiftMessage.Alignment.Center.equals(this.f159251c.m184070a())) {
                layoutParams.gravity = 17;
                layoutParams.leftMargin = t100.m186890d(10.0f);
            }
            this.f159252d.f49463a.setLayoutParams(layoutParams);
            viewGroup.addView(this.f159252d);
            m135866e(this.f159252d);
            this.f159252d.m73380s(this.f159251c);
        } else {
            DefaultBulletView defaultBulletViewM116621a = ei3Var.m116621a(BulletType.DEFAULT_BULLET_STYLE, viewGroup);
            viewGroup.addView(defaultBulletViewM116621a);
            defaultBulletViewM116621a.m73378i0(this.f159251c);
            m135865d(defaultBulletViewM116621a);
        }
        ygt ygtVar = new ygt(this.f159251c.m184077h().getGotoSchema());
        zh3.m218761d(this.f159251c.m184077h().getType(), this.f159251c.m184077h().getId(), m135868g(), this.f112955b.mo77274R2(), "jumpRoom".equals(ygtVar.f104769a) ? ygtVar.m214763g("roomId") : "", "jumpRoom".equals(ygtVar.f104769a) ? ygtVar.m214763g("liveId") : "");
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: s */
    public void mo135880s() {
        SpecialSystemBulletView specialSystemBulletView;
        if (TextUtils.isEmpty(this.f159251c.m184073d()) || (specialSystemBulletView = this.f159252d) == null) {
            return;
        }
        xdl0.m208327D0(specialSystemBulletView.f49463a.getWidth(), this.f159252d.f49470h);
        SVGALoader.with(this.f159252d.getContext()).from(this.f159251c.m184073d()).repeatCount(-1).autoPlay(true).into(this.f159252d.f49470h);
    }

    /* JADX INFO: renamed from: t */
    public sgh0 m179166t() {
        return this.f159251c;
    }
}
