package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.data.VoiceLiveStates;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;
import p149l.c0i;
import p149l.n0i;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSquareVoiceItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedSquareBottomStickoutView f42802d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f42803e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f42804f;

    /* JADX INFO: renamed from: g */
    public VText f42805g;

    /* JADX INFO: renamed from: h */
    public FeedUserHeaderView f42806h;

    /* JADX INFO: renamed from: i */
    public Space f42807i;

    public FeedSquareVoiceItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static GradientDrawable m65594i0(List<String> list) {
        int[] iArr;
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return null;
        }
        try {
            iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = Color.parseColor(list.get(i));
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            iArr = new int[]{Color.parseColor("#c9bdff"), Color.parseColor("#cdecff")};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(t100.f167260i);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m65595h0(View view) {
        c0i.m104752a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m65596j0(n0i n0iVar) {
        this.f42805g.getPaint().setFakeBoldText(true);
        VoiceLiveStates voiceLiveStates = n0iVar.f136559c;
        if (!NullChecker.m81303a(voiceLiveStates) || vwb.m200296J(voiceLiveStates.userAvatars)) {
            xdl0.m208344M(this.f42806h, false);
        } else {
            xdl0.m208344M(this.f42806h, true);
            this.f42806h.m66370l0();
            this.f42806h.m66371n0(n0iVar.f136559c.userAvatars, true);
        }
        if (NullChecker.m81303a(voiceLiveStates) && NullChecker.m81303a(voiceLiveStates.emotion)) {
            this.f42805g.setText(voiceLiveStates.emotion.text);
            SVGALoader.with(xdl0.m208326D(getContext())).from(voiceLiveStates.emotion.emojiUrl).autoPlay(true).repeatCount(1000).into(this.f42804f);
        }
        if (!NullChecker.m81303a(voiceLiveStates) || vwb.m200296J(voiceLiveStates.textTheme.backgroundColor)) {
            return;
        }
        this.f42803e.setBackgroundDrawable(m65594i0(n0iVar.f136559c.textTheme.backgroundColor));
        try {
            this.f42802d.setContentColor(Color.parseColor(n0iVar.f136559c.textTheme.backgroundColor.get(0)));
        } catch (Exception e) {
            this.f42802d.setContentColor(Color.parseColor("#ffffff"));
            CrashHelper.m81296c(e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65595h0(this);
    }

    public FeedSquareVoiceItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedSquareVoiceItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
