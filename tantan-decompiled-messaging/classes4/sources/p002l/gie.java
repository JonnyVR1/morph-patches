package p002l;

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
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import l.kvc0;
import l.s7m;
import l.t100;
import l.w8u;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gie implements s7m<qj2> {

    /* JADX INFO: renamed from: a */
    public qj2 f11449a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f11450b;

    /* JADX INFO: renamed from: c */
    public int f11451c = 0;

    /* JADX INFO: renamed from: l.gie$a */
    public class C0590a extends AnimListener {
        public C0590a() {
        }

        public void onFinished() {
            super.onFinished();
            gie.this.f11451c++;
            gie.this.m13823f();
        }
    }

    /* JADX INFO: renamed from: l.gie$b */
    public class C0591b extends AnimListener {
        public C0591b() {
        }

        public void onFinished() {
            super.onFinished();
            gie.this.f11451c++;
            gie.this.m13823f();
        }
    }

    public gie(FrameLayout frameLayout) {
        this.f11450b = frameLayout;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m13817a(View view, MotionEvent motionEvent) {
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13821C0() {
        return this.f11450b.getContext();
    }

    public void destroy() {
        m13824i();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m13825i1(qj2 qj2Var) {
        this.f11449a = qj2Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m13823f() {
        if (this.f11451c == 2) {
            m13824i();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m13824i() {
        View viewFindViewWithTag = this.f11450b.findViewWithTag("sweet_cp_view");
        if (viewFindViewWithTag != null) {
            this.f11450b.removeView(viewFindViewWithTag);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m13826j(VoiceSweet.VoiceSweetCpAnimation voiceSweetCpAnimation) {
        this.f11451c = 0;
        View viewFindViewWithTag = this.f11450b.findViewWithTag("sweet_cp_view");
        if (viewFindViewWithTag != null) {
            this.f11450b.removeView(viewFindViewWithTag);
        }
        View viewInflate = LayoutInflater.from(this.f11450b.getContext()).inflate(t6c0.f19896jb, (ViewGroup) null);
        viewInflate.setTag("sweet_cp_view");
        FrameLayout frameLayout = this.f11450b;
        int i = xdl0.e;
        frameLayout.addView(viewInflate, i, i);
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: l.fie
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return gie.m13817a(view, motionEvent);
            }
        });
        AnimEffectPlayer animEffectPlayerFindViewById = viewInflate.findViewById(g5c0.f11261z2);
        AnimEffectPlayer animEffectPlayerFindViewById2 = viewInflate.findViewById(g5c0.f11103i0);
        if (voiceSweetCpAnimation.hasHouseInfo() && !TextUtils.isEmpty(voiceSweetCpAnimation.getHouseInfo().getAvatarAnimationUrl()) && voiceSweetCpAnimation.getCpUsersCount() >= 2) {
            userMaskConfig.UserMask cpUsers = voiceSweetCpAnimation.getCpUsers(0);
            userMaskConfig.UserMask cpUsers2 = voiceSweetCpAnimation.getCpUsers(1);
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            sVGADynamicEntity.setDynamicImage(cpUsers.getAvatar(), "head_01");
            sVGADynamicEntity.setDynamicImage(cpUsers2.getAvatar(), "head_02");
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(t100.f(15));
            textPaint.setColor(kvc0.a(h1c0.f11815p1));
            textPaint.setAntiAlias(true);
            Paint.Align align = Paint.Align.CENTER;
            textPaint.setTextAlign(align);
            sVGADynamicEntity.setDynamicText("恭喜" + w8u.p(cpUsers.getName(), 3) + "和" + w8u.p(cpUsers2.getName(), 3), textPaint, "text_01");
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize((float) t100.f(16));
            textPaint2.setColor(-1);
            textPaint2.setAntiAlias(true);
            textPaint2.setFakeBoldText(true);
            textPaint2.setTextAlign(align);
            sVGADynamicEntity.setDynamicText("甜蜜小屋升级至 LV" + voiceSweetCpAnimation.getHouseInfo().getHouseLevel(), textPaint2, "text_02");
            SVGALoader.with(this.f11449a.act()).from(voiceSweetCpAnimation.getHouseInfo().getAvatarAnimationUrl()).frameMode(SVGAnimationView.FrameMode.AFTER).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C0590a()).repeatCount(1).into(animEffectPlayerFindViewById2);
        }
        if (TextUtils.isEmpty(voiceSweetCpAnimation.getAnimationUrl())) {
            return;
        }
        SVGALoader.with(this.f11449a.act()).from(voiceSweetCpAnimation.getAnimationUrl()).frameMode(SVGAnimationView.FrameMode.AFTER).autoPlay(true).animListener(new C0591b()).repeatCount(1).into(animEffectPlayerFindViewById);
    }
}
