package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.data.VoiceLiveStates;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.c0i;
import p007l.n0i;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSquareVoiceItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedSquareBottomStickoutView f4263d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f4264e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f4265f;

    /* JADX INFO: renamed from: g */
    public VText f4266g;

    /* JADX INFO: renamed from: h */
    public FeedUserHeaderView f4267h;

    /* JADX INFO: renamed from: i */
    public Space f4268i;

    public FeedSquareVoiceItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static GradientDrawable m6731i0(List<String> list) {
        int[] iArr;
        if (!NullChecker.a(list) || list.size() <= 0) {
            return null;
        }
        try {
            iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = Color.parseColor(list.get(i));
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            iArr = new int[]{Color.parseColor("#c9bdff"), Color.parseColor("#cdecff")};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(t100.i);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6732h0(View view) {
        c0i.m9062a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m6733j0(n0i n0iVar) {
        this.f4266g.getPaint().setFakeBoldText(true);
        VoiceLiveStates voiceLiveStates = n0iVar.f10615c;
        if (!NullChecker.a(voiceLiveStates) || vwb.J(voiceLiveStates.userAvatars)) {
            xdl0.M(this.f4267h, false);
        } else {
            xdl0.M(this.f4267h, true);
            this.f4267h.m7535l0();
            this.f4267h.m7536n0(n0iVar.f10615c.userAvatars, true);
        }
        if (NullChecker.a(voiceLiveStates) && NullChecker.a(voiceLiveStates.emotion)) {
            this.f4266g.setText(voiceLiveStates.emotion.text);
            SVGALoader.with(xdl0.D(getContext())).from(voiceLiveStates.emotion.emojiUrl).autoPlay(true).repeatCount(MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO).into(this.f4265f);
        }
        if (!NullChecker.a(voiceLiveStates) || vwb.J(voiceLiveStates.textTheme.backgroundColor)) {
            return;
        }
        this.f4264e.setBackgroundDrawable(m6731i0(n0iVar.f10615c.textTheme.backgroundColor));
        try {
            this.f4263d.setContentColor(Color.parseColor(n0iVar.f10615c.textTheme.backgroundColor.get(0)));
        } catch (Exception e) {
            this.f4263d.setContentColor(Color.parseColor("#ffffff"));
            CrashHelper.c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6732h0(this);
    }

    public FeedSquareVoiceItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedSquareVoiceItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
