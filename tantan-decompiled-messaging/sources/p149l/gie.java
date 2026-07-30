package p149l;

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
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;

/* JADX INFO: loaded from: classes4.dex */
public class gie implements s7m<qj2> {

    /* JADX INFO: renamed from: a */
    public qj2 f102886a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f102887b;

    /* JADX INFO: renamed from: c */
    public int f102888c = 0;

    /* JADX INFO: renamed from: l.gie$a */
    public class C17083a extends AnimListener {
        public C17083a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            gie.this.f102888c++;
            gie.this.m126286f();
        }
    }

    /* JADX INFO: renamed from: l.gie$b */
    public class C17084b extends AnimListener {
        public C17084b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            gie.this.f102888c++;
            gie.this.m126286f();
        }
    }

    public gie(FrameLayout frameLayout) {
        this.f102887b = frameLayout;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m126281a(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f102887b.getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        m126287i();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qj2 qj2Var) {
        this.f102886a = qj2Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m126286f() {
        if (this.f102888c == 2) {
            m126287i();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m126287i() {
        View viewFindViewWithTag = this.f102887b.findViewWithTag("sweet_cp_view");
        if (viewFindViewWithTag != null) {
            this.f102887b.removeView(viewFindViewWithTag);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m126288j(VoiceSweet.VoiceSweetCpAnimation voiceSweetCpAnimation) {
        this.f102888c = 0;
        View viewFindViewWithTag = this.f102887b.findViewWithTag("sweet_cp_view");
        if (viewFindViewWithTag != null) {
            this.f102887b.removeView(viewFindViewWithTag);
        }
        View viewInflate = LayoutInflater.from(this.f102887b.getContext()).inflate(t6c0.f168400jb, (ViewGroup) null);
        viewInflate.setTag("sweet_cp_view");
        FrameLayout frameLayout = this.f102887b;
        int i = xdl0.f192403e;
        frameLayout.addView(viewInflate, i, i);
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: l.fie
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return gie.m126281a(view, motionEvent);
            }
        });
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewInflate.findViewById(g5c0.f101111z2);
        AnimEffectPlayer animEffectPlayer2 = (AnimEffectPlayer) viewInflate.findViewById(g5c0.f100953i0);
        if (voiceSweetCpAnimation.hasHouseInfo() && !TextUtils.isEmpty(voiceSweetCpAnimation.getHouseInfo().getAvatarAnimationUrl()) && voiceSweetCpAnimation.getCpUsersCount() >= 2) {
            userMaskConfig.UserMask cpUsers = voiceSweetCpAnimation.getCpUsers(0);
            userMaskConfig.UserMask cpUsers2 = voiceSweetCpAnimation.getCpUsers(1);
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            sVGADynamicEntity.setDynamicImage(cpUsers.getAvatar(), "head_01");
            sVGADynamicEntity.setDynamicImage(cpUsers2.getAvatar(), "head_02");
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(t100.m186892f(15));
            textPaint.setColor(kvc0.m147352a(h1c0.f105395p1));
            textPaint.setAntiAlias(true);
            Paint.Align align = Paint.Align.CENTER;
            textPaint.setTextAlign(align);
            sVGADynamicEntity.setDynamicText("恭喜" + w8u.m202213p(cpUsers.getName(), 3) + "和" + w8u.m202213p(cpUsers2.getName(), 3), textPaint, "text_01");
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize((float) t100.m186892f(16));
            textPaint2.setColor(-1);
            textPaint2.setAntiAlias(true);
            textPaint2.setFakeBoldText(true);
            textPaint2.setTextAlign(align);
            sVGADynamicEntity.setDynamicText("甜蜜小屋升级至 LV" + voiceSweetCpAnimation.getHouseInfo().getHouseLevel(), textPaint2, "text_02");
            SVGALoader.with(this.f102886a.act()).from(voiceSweetCpAnimation.getHouseInfo().getAvatarAnimationUrl()).frameMode(SVGAnimationView.FrameMode.AFTER).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C17083a()).repeatCount(1).into(animEffectPlayer2);
        }
        if (TextUtils.isEmpty(voiceSweetCpAnimation.getAnimationUrl())) {
            return;
        }
        SVGALoader.with(this.f102886a.act()).from(voiceSweetCpAnimation.getAnimationUrl()).frameMode(SVGAnimationView.FrameMode.AFTER).autoPlay(true).animListener(new C17084b()).repeatCount(1).into(animEffectPlayer);
    }
}
