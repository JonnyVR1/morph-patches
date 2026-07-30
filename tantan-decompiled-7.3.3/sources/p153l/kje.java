package p153l;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;

/* JADX INFO: loaded from: classes4.dex */
public class kje implements iam<yj2> {

    /* JADX INFO: renamed from: a */
    public yj2 f127091a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f127092b;

    /* JADX INFO: renamed from: c */
    public int f127093c = 0;

    /* JADX INFO: renamed from: l.kje$a */
    public class C18175a extends AnimListener {
        public C18175a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            kje.this.f127093c++;
            kje.this.m150031f();
        }
    }

    /* JADX INFO: renamed from: l.kje$b */
    public class C18176b extends AnimListener {
        public C18176b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            kje.this.f127093c++;
            kje.this.m150031f();
        }
    }

    public kje(FrameLayout frameLayout) {
        this.f127092b = frameLayout;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m150026a(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f127092b.getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        m150032i();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yj2 yj2Var) {
        this.f127091a = yj2Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m150031f() {
        if (this.f127093c == 2) {
            m150032i();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m150032i() {
        View viewFindViewWithTag = this.f127092b.findViewWithTag("sweet_cp_view");
        if (viewFindViewWithTag != null) {
            this.f127092b.removeView(viewFindViewWithTag);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m150033j(VoiceSweet.VoiceSweetCpAnimation voiceSweetCpAnimation) {
        this.f127093c = 0;
        View viewFindViewWithTag = this.f127092b.findViewWithTag("sweet_cp_view");
        if (viewFindViewWithTag != null) {
            this.f127092b.removeView(viewFindViewWithTag);
        }
        View viewInflate = LayoutInflater.from(this.f127092b.getContext()).inflate(yec0.f199132jb, (ViewGroup) null);
        viewInflate.setTag("sweet_cp_view");
        FrameLayout frameLayout = this.f127092b;
        int i = bnl0.f77544e;
        frameLayout.addView(viewInflate, i, i);
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: l.jje
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return kje.m150026a(view, motionEvent);
            }
        });
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewInflate.findViewById(mdc0.f136356z2);
        AnimEffectPlayer animEffectPlayer2 = (AnimEffectPlayer) viewInflate.findViewById(mdc0.f136198i0);
        if (voiceSweetCpAnimation.hasHouseInfo() && !TextUtils.isEmpty(voiceSweetCpAnimation.getHouseInfo().getAvatarAnimationUrl()) && voiceSweetCpAnimation.getCpUsersCount() >= 2) {
            userMaskConfig.UserMask cpUsers = voiceSweetCpAnimation.getCpUsers(0);
            userMaskConfig.UserMask cpUsers2 = voiceSweetCpAnimation.getCpUsers(1);
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            sVGADynamicEntity.setDynamicImage(cpUsers.getAvatar(), "head_01");
            sVGADynamicEntity.setDynamicImage(cpUsers2.getAvatar(), "head_02");
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(qa00.m175861f(15));
            textPaint.setColor(n3d0.m161277a(n9c0.f140856p1));
            textPaint.setAntiAlias(true);
            Paint.Align align = Paint.Align.CENTER;
            textPaint.setTextAlign(align);
            sVGADynamicEntity.setDynamicText("恭喜" + xau.m209906p(cpUsers.getName(), 3) + "和" + xau.m209906p(cpUsers2.getName(), 3), textPaint, "text_01");
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize((float) qa00.m175861f(16));
            textPaint2.setColor(-1);
            textPaint2.setAntiAlias(true);
            textPaint2.setFakeBoldText(true);
            textPaint2.setTextAlign(align);
            sVGADynamicEntity.setDynamicText("甜蜜小屋升级至 LV" + voiceSweetCpAnimation.getHouseInfo().getHouseLevel(), textPaint2, "text_02");
            SVGALoader.with(this.f127091a.act()).from(voiceSweetCpAnimation.getHouseInfo().getAvatarAnimationUrl()).frameMode(SVGAnimationView.FrameMode.AFTER).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C18175a()).repeatCount(1).into(animEffectPlayer2);
        }
        if (TextUtils.isEmpty(voiceSweetCpAnimation.getAnimationUrl())) {
            return;
        }
        SVGALoader.with(this.f127091a.act()).from(voiceSweetCpAnimation.getAnimationUrl()).frameMode(SVGAnimationView.FrameMode.AFTER).autoPlay(true).animListener(new C18176b()).repeatCount(1).into(animEffectPlayer);
    }
}
