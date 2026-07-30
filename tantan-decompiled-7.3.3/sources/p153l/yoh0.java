package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import com.tantan.library.svga.SVGALoader;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes4.dex */
public class yoh0 extends pf2 {

    /* JADX INFO: renamed from: c */
    public zoh0 f200979c;

    /* JADX INFO: renamed from: d */
    public SpecialSystemBulletView f200980d;

    public yoh0(zoh0 zoh0Var) {
        this.f200979c = zoh0Var;
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: i */
    public CharSequence mo114496i() {
        return this.f200979c.m220767c();
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder mo172077l() {
        return this.f200979c.m220773i();
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: m */
    public long mo172078m() {
        long displayDuration = this.f200979c.m220772h().getDisplayDuration();
        return displayDuration > 0 ? displayDuration : super.mo172078m();
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: o */
    public void mo114497o() {
        if (TextUtils.isEmpty(this.f200979c.m220772h().getGotoSchema())) {
            return;
        }
        zit zitVar = new zit(this.f200979c.m220772h().getGotoSchema());
        ni3.m163266c(this.f200979c.m220772h().getType(), this.f200979c.m220772h().getId(), m172073g(), this.f152150b.mo78457R2(), "jumpRoom".equals(zitVar.f112154a) ? zitVar.m219937g("roomId") : "", "jumpRoom".equals(zitVar.f112154a) ? zitVar.m219937g("liveId") : "");
        this.f152150b.mo138869p3(MMKV.ExpireInHour, this.f200979c.m220772h().getGotoSchema());
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: r */
    public void mo114498r(ViewGroup viewGroup, si3 si3Var) {
        if (this.f200979c.m220777m()) {
            SpecialSystemBulletView specialSystemBulletViewM186001b = si3Var.m186001b(viewGroup);
            this.f200980d = specialSystemBulletViewM186001b;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) specialSystemBulletViewM186001b.f50311a.getLayoutParams();
            if (LongLinkGiftMessage.Alignment.Left.equals(this.f200979c.m220765a())) {
                layoutParams.gravity = 16;
                layoutParams.leftMargin = qa00.m175859d(8.0f);
            } else if (LongLinkGiftMessage.Alignment.Center.equals(this.f200979c.m220765a())) {
                layoutParams.gravity = 17;
                layoutParams.leftMargin = qa00.m175859d(10.0f);
            }
            this.f200980d.f50311a.setLayoutParams(layoutParams);
            viewGroup.addView(this.f200980d);
            m172071e(this.f200980d);
            this.f200980d.m74563s(this.f200979c);
        } else {
            DefaultBulletView defaultBulletViewM186000a = si3Var.m186000a(BulletType.DEFAULT_BULLET_STYLE, viewGroup);
            viewGroup.addView(defaultBulletViewM186000a);
            defaultBulletViewM186000a.m74561i0(this.f200979c);
            m172070d(defaultBulletViewM186000a);
        }
        zit zitVar = new zit(this.f200979c.m220772h().getGotoSchema());
        ni3.m163267d(this.f200979c.m220772h().getType(), this.f200979c.m220772h().getId(), m172073g(), this.f152150b.mo78457R2(), "jumpRoom".equals(zitVar.f112154a) ? zitVar.m219937g("roomId") : "", "jumpRoom".equals(zitVar.f112154a) ? zitVar.m219937g("liveId") : "");
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: s */
    public void mo172082s() {
        SpecialSystemBulletView specialSystemBulletView;
        if (TextUtils.isEmpty(this.f200979c.m220768d()) || (specialSystemBulletView = this.f200980d) == null) {
            return;
        }
        bnl0.m105507D0(specialSystemBulletView.f50311a.getWidth(), this.f200980d.f50318h);
        SVGALoader.with(this.f200980d.getContext()).from(this.f200979c.m220768d()).repeatCount(-1).autoPlay(true).into(this.f200980d.f50318h);
    }

    /* JADX INFO: renamed from: t */
    public zoh0 m216977t() {
        return this.f200979c;
    }
}
