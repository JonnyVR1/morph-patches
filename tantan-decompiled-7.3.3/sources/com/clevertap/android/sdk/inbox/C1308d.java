package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.inbox.C1308d;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import p153l.c5d0;
import p153l.icc0;
import p153l.wbc0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C1308d extends RecyclerView.AbstractC0569e0 {

    /* JADX INFO: renamed from: a */
    Context f5363a;

    /* JADX INFO: renamed from: b */
    LinearLayout f5364b;

    /* JADX INFO: renamed from: c */
    LinearLayout f5365c;

    /* JADX INFO: renamed from: d */
    FrameLayout f5366d;

    /* JADX INFO: renamed from: e */
    ImageView f5367e;

    /* JADX INFO: renamed from: f */
    ImageView f5368f;

    /* JADX INFO: renamed from: g */
    ImageView f5369g;

    /* JADX INFO: renamed from: h */
    RelativeLayout f5370h;

    /* JADX INFO: renamed from: i */
    FrameLayout f5371i;

    /* JADX INFO: renamed from: j */
    RelativeLayout f5372j;

    /* JADX INFO: renamed from: k */
    RelativeLayout f5373k;

    /* JADX INFO: renamed from: l */
    private CTInboxMessageContent f5374l;

    /* JADX INFO: renamed from: m */
    private CTInboxMessage f5375m;

    /* JADX INFO: renamed from: n */
    private ImageView f5376n;

    /* JADX INFO: renamed from: o */
    private WeakReference<CTInboxListViewFragment> f5377o;

    /* JADX INFO: renamed from: p */
    private boolean f5378p;

    /* JADX INFO: renamed from: q */
    protected final ImageView f5379q;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f5380a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CTInboxMessage f5381b;

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.d$a$a, reason: collision with other inner class name */
        public class RunnableC22781a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CTInboxListViewFragment f5383a;

            public RunnableC22781a(CTInboxListViewFragment cTInboxListViewFragment) {
                this.f5383a = cTInboxListViewFragment;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C1308d.this.f5379q.getVisibility() == 0) {
                    this.f5383a.m6726a4(null, a.this.f5380a);
                }
                C1308d.this.f5379q.setVisibility(8);
                a.this.f5381b.m6743l(true);
            }
        }

        public a(int i, CTInboxMessage cTInboxMessage) {
            this.f5380a = i;
            this.f5381b = cTInboxMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentActivity activity;
            CTInboxListViewFragment cTInboxListViewFragmentM6799i = C1308d.this.m6799i();
            if (cTInboxListViewFragmentM6799i == null || (activity = cTInboxListViewFragmentM6799i.getActivity()) == null) {
                return;
            }
            activity.runOnUiThread(new RunnableC22781a(cTInboxListViewFragmentM6799i));
        }
    }

    public C1308d(@NonNull View view) {
        super(view);
        this.f5379q = (ImageView) view.findViewById(icc0.f114317H0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6793c(C1308d c1308d, Function0 function0, View view) {
        c1308d.getClass();
        c1308d.m6795r(c1308d.f5376n, c1308d.f5363a, ((Float) function0.invoke()).floatValue());
    }

    /* JADX INFO: renamed from: h */
    private FrameLayout m6794h() {
        return this.f5366d;
    }

    /* JADX INFO: renamed from: r */
    private void m6795r(ImageView imageView, Context context, float f) {
        boolean z = f <= 0.0f;
        int i = z ? wbc0.f188242o : wbc0.f188243p;
        imageView.setContentDescription(context.getString(z ? R$string.f4865f : R$string.f4871l));
        imageView.setImageDrawable(c5d0.m108035e(context.getResources(), i, null));
    }

    /* JADX INFO: renamed from: d */
    public boolean m6796d(float f, final Function0<Float> function0, Function3<String, Boolean, Boolean, Void> function3, View view) {
        FrameLayout frameLayoutM6794h;
        int measuredHeight;
        int measuredHeight2;
        int measuredWidth;
        int measuredHeight3;
        if (!this.f5378p || (frameLayoutM6794h = m6794h()) == null) {
            return false;
        }
        frameLayoutM6794h.removeAllViews();
        frameLayoutM6794h.setVisibility(8);
        Resources resources = this.f5363a.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (CTInboxActivity.f5293k != 2) {
            measuredHeight = resources.getDisplayMetrics().widthPixels;
            if (this.f5375m.m6738f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f45292l)) {
                measuredHeight2 = Math.round(measuredHeight * 0.5625f);
            } else if (this.f5375m.m6738f().equalsIgnoreCase("p")) {
                measuredHeight2 = measuredHeight;
            } else {
                ImageView imageView = this.f5369g;
                measuredHeight2 = imageView != null ? imageView.getMeasuredHeight() : 0;
                if (this.f5369g == null || measuredHeight2 == 0) {
                    measuredHeight2 = Math.round(measuredHeight * 0.5625f);
                }
            }
        } else if (this.f5375m.m6738f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f45292l)) {
            measuredHeight = Math.round(this.f5367e.getMeasuredHeight() * 1.76f);
            measuredHeight2 = this.f5367e.getMeasuredHeight();
        } else if (this.f5375m.m6738f().equalsIgnoreCase("p")) {
            measuredHeight = this.f5368f.getMeasuredHeight();
            measuredHeight2 = measuredHeight;
        } else {
            ImageView imageView2 = this.f5369g;
            if (imageView2 != null) {
                measuredWidth = imageView2.getMeasuredWidth();
                measuredHeight3 = this.f5369g.getMeasuredHeight();
            } else {
                measuredWidth = 0;
                measuredHeight3 = 0;
            }
            if (this.f5369g == null || measuredWidth == 0 || measuredHeight3 == 0) {
                measuredHeight = resources.getDisplayMetrics().widthPixels / 2;
                measuredHeight2 = Math.round(measuredHeight * 0.5625f);
            } else {
                measuredHeight = measuredWidth;
                measuredHeight2 = measuredHeight3;
            }
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(measuredHeight, measuredHeight2));
        frameLayoutM6794h.addView(view);
        frameLayoutM6794h.setBackgroundColor(Color.parseColor(this.f5375m.m6733a()));
        FrameLayout frameLayout = this.f5371i;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (this.f5374l.m6747B()) {
            ImageView imageView3 = new ImageView(this.f5363a);
            this.f5376n = imageView3;
            imageView3.setVisibility(8);
            m6795r(this.f5376n, this.f5363a, f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 30.0f, displayMetrics), (int) TypedValue.applyDimension(1, 30.0f, displayMetrics));
            layoutParams.setMargins(0, (int) TypedValue.applyDimension(1, 4.0f, displayMetrics), (int) TypedValue.applyDimension(1, 2.0f, displayMetrics), 0);
            layoutParams.gravity = 8388613;
            this.f5376n.setLayoutParams(layoutParams);
            this.f5376n.setOnClickListener(new View.OnClickListener() { // from class: l.bw3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C1308d.m6793c(this.f78677a, function0, view2);
                }
            });
            frameLayoutM6794h.addView(this.f5376n);
        }
        function3.invoke(this.f5374l.m6760n(), Boolean.valueOf(this.f5374l.m6769x()), Boolean.valueOf(this.f5374l.m6747B()));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public String m6797e(long j) {
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        if (jCurrentTimeMillis < 60) {
            return "Just Now";
        }
        if (jCurrentTimeMillis > 60 && jCurrentTimeMillis < 3540) {
            return (jCurrentTimeMillis / 60) + " mins ago";
        }
        if (jCurrentTimeMillis <= 3540 || jCurrentTimeMillis >= 81420) {
            return (jCurrentTimeMillis <= 86400 || jCurrentTimeMillis >= 172800) ? new SimpleDateFormat("dd MMM").format(new Date(j * 1000)) : "Yesterday";
        }
        long j2 = jCurrentTimeMillis / 3600;
        if (j2 > 1) {
            return j2 + " hours ago";
        }
        return j2 + " hour ago";
    }

    /* JADX INFO: renamed from: f */
    public void mo6788f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        this.f5363a = cTInboxListViewFragment.getContext();
        this.f5377o = new WeakReference<>(cTInboxListViewFragment);
        this.f5375m = cTInboxMessage;
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.m6736d().get(0);
        this.f5374l = cTInboxMessageContent;
        this.f5378p = cTInboxMessageContent.m6746A();
    }

    /* JADX INFO: renamed from: g */
    public int m6798g() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public CTInboxListViewFragment m6799i() {
        return this.f5377o.get();
    }

    /* JADX INFO: renamed from: j */
    public void m6800j(Button button, Button button2, Button button3) {
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    /* JADX INFO: renamed from: k */
    public void m6801k(Button button, Button button2, Button button3) {
        button2.setVisibility(8);
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 6.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    /* JADX INFO: renamed from: l */
    public void m6802l(CTInboxMessage cTInboxMessage, int i) {
        new Handler().postDelayed(new a(i, cTInboxMessage), 2000L);
    }

    /* JADX INFO: renamed from: m */
    public boolean m6803m() {
        return this.f5378p;
    }

    /* JADX INFO: renamed from: n */
    public void m6804n() {
        FrameLayout frameLayout = this.f5371i;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6805o() {
        m6794h().setVisibility(0);
        ImageView imageView = this.f5376n;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        FrameLayout frameLayout = this.f5371i;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m6806p() {
        FrameLayout frameLayout = this.f5371i;
        if (frameLayout != null) {
            frameLayout.post(new Runnable() { // from class: l.zv3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f206182a.f5371i.setVisibility(8);
                }
            });
        }
        ImageView imageView = this.f5376n;
        if (imageView != null) {
            imageView.post(new Runnable() { // from class: l.aw3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73684a.f5376n.setVisibility(8);
                }
            });
        }
        FrameLayout frameLayoutM6794h = m6794h();
        if (frameLayoutM6794h != null) {
            frameLayoutM6794h.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6807q(ImageView[] imageViewArr, int i, Context context, LinearLayout linearLayout) {
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView = new ImageView(context);
            imageViewArr[i2] = imageView;
            imageView.setVisibility(0);
            imageViewArr[i2].setImageDrawable(c5d0.m108035e(context.getResources(), wbc0.f188241n, null));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(8, 6, 4, 6);
            layoutParams.gravity = 17;
            if (linearLayout.getChildCount() < i) {
                linearLayout.addView(imageViewArr[i2], layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m6808s() {
        return this.f5374l.m6747B();
    }
}
