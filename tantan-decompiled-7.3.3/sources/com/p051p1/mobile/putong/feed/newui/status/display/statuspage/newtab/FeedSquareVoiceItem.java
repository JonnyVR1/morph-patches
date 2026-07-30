package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.data.VoiceLiveStates;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.c2i;
import p153l.jyb;
import p153l.qa00;
import p153l.r1i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSquareVoiceItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedSquareBottomStickoutView f43650d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f43651e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f43652f;

    /* JADX INFO: renamed from: g */
    public VText f43653g;

    /* JADX INFO: renamed from: h */
    public FeedUserHeaderView f43654h;

    /* JADX INFO: renamed from: i */
    public Space f43655i;

    public FeedSquareVoiceItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static GradientDrawable m66777i0(List<String> list) {
        int[] iArr;
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return null;
        }
        try {
            iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = Color.parseColor(list.get(i));
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            iArr = new int[]{Color.parseColor("#c9bdff"), Color.parseColor("#cdecff")};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(qa00.f156322i);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m66778h0(View view) {
        r1i.m179408a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m66779j0(c2i c2iVar) {
        this.f43653g.getPaint().setFakeBoldText(true);
        VoiceLiveStates voiceLiveStates = c2iVar.f79482c;
        if (!NullChecker.m82486a(voiceLiveStates) || jyb.m147479J(voiceLiveStates.userAvatars)) {
            bnl0.m105524M(this.f43654h, false);
        } else {
            bnl0.m105524M(this.f43654h, true);
            this.f43654h.m67553l0();
            this.f43654h.m67554n0(c2iVar.f79482c.userAvatars, true);
        }
        if (NullChecker.m82486a(voiceLiveStates) && NullChecker.m82486a(voiceLiveStates.emotion)) {
            this.f43653g.setText(voiceLiveStates.emotion.text);
            SVGALoader.with(bnl0.m105506D(getContext())).from(voiceLiveStates.emotion.emojiUrl).autoPlay(true).repeatCount(1000).into(this.f43652f);
        }
        if (!NullChecker.m82486a(voiceLiveStates) || jyb.m147479J(voiceLiveStates.textTheme.backgroundColor)) {
            return;
        }
        this.f43651e.setBackgroundDrawable(m66777i0(c2iVar.f79482c.textTheme.backgroundColor));
        try {
            this.f43650d.setContentColor(Color.parseColor(c2iVar.f79482c.textTheme.backgroundColor.get(0)));
        } catch (Exception e) {
            this.f43650d.setContentColor(Color.parseColor("#ffffff"));
            CrashHelper.m82479c(e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66778h0(this);
    }

    public FeedSquareVoiceItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedSquareVoiceItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
