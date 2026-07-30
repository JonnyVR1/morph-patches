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
import com.clevertap.android.sdk.inbox.C1285d;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import p149l.c4c0;
import p149l.q3c0;
import p149l.ywc0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C1285d extends RecyclerView.AbstractC0566d0 {

    /* JADX INFO: renamed from: a */
    Context f5326a;

    /* JADX INFO: renamed from: b */
    LinearLayout f5327b;

    /* JADX INFO: renamed from: c */
    LinearLayout f5328c;

    /* JADX INFO: renamed from: d */
    FrameLayout f5329d;

    /* JADX INFO: renamed from: e */
    ImageView f5330e;

    /* JADX INFO: renamed from: f */
    ImageView f5331f;

    /* JADX INFO: renamed from: g */
    ImageView f5332g;

    /* JADX INFO: renamed from: h */
    RelativeLayout f5333h;

    /* JADX INFO: renamed from: i */
    FrameLayout f5334i;

    /* JADX INFO: renamed from: j */
    RelativeLayout f5335j;

    /* JADX INFO: renamed from: k */
    RelativeLayout f5336k;

    /* JADX INFO: renamed from: l */
    private CTInboxMessageContent f5337l;

    /* JADX INFO: renamed from: m */
    private CTInboxMessage f5338m;

    /* JADX INFO: renamed from: n */
    private ImageView f5339n;

    /* JADX INFO: renamed from: o */
    private WeakReference<CTInboxListViewFragment> f5340o;

    /* JADX INFO: renamed from: p */
    private boolean f5341p;

    /* JADX INFO: renamed from: q */
    protected final ImageView f5342q;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f5343a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CTInboxMessage f5344b;

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.d$a$a, reason: collision with other inner class name */
        public class RunnableC22665a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CTInboxListViewFragment f5346a;

            public RunnableC22665a(CTInboxListViewFragment cTInboxListViewFragment) {
                this.f5346a = cTInboxListViewFragment;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C1285d.this.f5342q.getVisibility() == 0) {
                    this.f5346a.m6672a4(null, a.this.f5343a);
                }
                C1285d.this.f5342q.setVisibility(8);
                a.this.f5344b.m6689l(true);
            }
        }

        public a(int i, CTInboxMessage cTInboxMessage) {
            this.f5343a = i;
            this.f5344b = cTInboxMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentActivity activity;
            CTInboxListViewFragment cTInboxListViewFragmentM6745i = C1285d.this.m6745i();
            if (cTInboxListViewFragmentM6745i == null || (activity = cTInboxListViewFragmentM6745i.getActivity()) == null) {
                return;
            }
            activity.runOnUiThread(new RunnableC22665a(cTInboxListViewFragmentM6745i));
        }
    }

    public C1285d(@NonNull View view) {
        super(view);
        this.f5342q = (ImageView) view.findViewById(c4c0.f79181H0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6739c(C1285d c1285d, Function0 function0, View view) {
        c1285d.getClass();
        c1285d.m6741r(c1285d.f5339n, c1285d.f5326a, ((Float) function0.invoke()).floatValue());
    }

    /* JADX INFO: renamed from: h */
    private FrameLayout m6740h() {
        return this.f5329d;
    }

    /* JADX INFO: renamed from: r */
    private void m6741r(ImageView imageView, Context context, float f) {
        boolean z = f <= 0.0f;
        int i = z ? q3c0.f152414o : q3c0.f152415p;
        imageView.setContentDescription(context.getString(z ? R$string.f4828f : R$string.f4834l));
        imageView.setImageDrawable(ywc0.m216334e(context.getResources(), i, null));
    }

    /* JADX INFO: renamed from: d */
    public boolean m6742d(float f, final Function0<Float> function0, Function3<String, Boolean, Boolean, Void> function3, View view) {
        FrameLayout frameLayoutM6740h;
        int measuredHeight;
        int measuredHeight2;
        int measuredWidth;
        int measuredHeight3;
        if (!this.f5341p || (frameLayoutM6740h = m6740h()) == null) {
            return false;
        }
        frameLayoutM6740h.removeAllViews();
        frameLayoutM6740h.setVisibility(8);
        Resources resources = this.f5326a.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (CTInboxActivity.f5256k != 2) {
            measuredHeight = resources.getDisplayMetrics().widthPixels;
            if (this.f5338m.m6684f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f44444l)) {
                measuredHeight2 = Math.round(measuredHeight * 0.5625f);
            } else if (this.f5338m.m6684f().equalsIgnoreCase("p")) {
                measuredHeight2 = measuredHeight;
            } else {
                ImageView imageView = this.f5332g;
                measuredHeight2 = imageView != null ? imageView.getMeasuredHeight() : 0;
                if (this.f5332g == null || measuredHeight2 == 0) {
                    measuredHeight2 = Math.round(measuredHeight * 0.5625f);
                }
            }
        } else if (this.f5338m.m6684f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f44444l)) {
            measuredHeight = Math.round(this.f5330e.getMeasuredHeight() * 1.76f);
            measuredHeight2 = this.f5330e.getMeasuredHeight();
        } else if (this.f5338m.m6684f().equalsIgnoreCase("p")) {
            measuredHeight = this.f5331f.getMeasuredHeight();
            measuredHeight2 = measuredHeight;
        } else {
            ImageView imageView2 = this.f5332g;
            if (imageView2 != null) {
                measuredWidth = imageView2.getMeasuredWidth();
                measuredHeight3 = this.f5332g.getMeasuredHeight();
            } else {
                measuredWidth = 0;
                measuredHeight3 = 0;
            }
            if (this.f5332g == null || measuredWidth == 0 || measuredHeight3 == 0) {
                measuredHeight = resources.getDisplayMetrics().widthPixels / 2;
                measuredHeight2 = Math.round(measuredHeight * 0.5625f);
            } else {
                measuredHeight = measuredWidth;
                measuredHeight2 = measuredHeight3;
            }
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(measuredHeight, measuredHeight2));
        frameLayoutM6740h.addView(view);
        frameLayoutM6740h.setBackgroundColor(Color.parseColor(this.f5338m.m6679a()));
        FrameLayout frameLayout = this.f5334i;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (this.f5337l.m6693B()) {
            ImageView imageView3 = new ImageView(this.f5326a);
            this.f5339n = imageView3;
            imageView3.setVisibility(8);
            m6741r(this.f5339n, this.f5326a, f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 30.0f, displayMetrics), (int) TypedValue.applyDimension(1, 30.0f, displayMetrics));
            layoutParams.setMargins(0, (int) TypedValue.applyDimension(1, 4.0f, displayMetrics), (int) TypedValue.applyDimension(1, 2.0f, displayMetrics), 0);
            layoutParams.gravity = 8388613;
            this.f5339n.setLayoutParams(layoutParams);
            this.f5339n.setOnClickListener(new View.OnClickListener() { // from class: l.cv3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C1285d.m6739c(this.f82633a, function0, view2);
                }
            });
            frameLayoutM6740h.addView(this.f5339n);
        }
        function3.invoke(this.f5337l.m6706n(), Boolean.valueOf(this.f5337l.m6715x()), Boolean.valueOf(this.f5337l.m6693B()));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public String m6743e(long j) {
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
    public void mo6734f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        this.f5326a = cTInboxListViewFragment.getContext();
        this.f5340o = new WeakReference<>(cTInboxListViewFragment);
        this.f5338m = cTInboxMessage;
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.m6682d().get(0);
        this.f5337l = cTInboxMessageContent;
        this.f5341p = cTInboxMessageContent.m6692A();
    }

    /* JADX INFO: renamed from: g */
    public int m6744g() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public CTInboxListViewFragment m6745i() {
        return this.f5340o.get();
    }

    /* JADX INFO: renamed from: j */
    public void m6746j(Button button, Button button2, Button button3) {
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    /* JADX INFO: renamed from: k */
    public void m6747k(Button button, Button button2, Button button3) {
        button2.setVisibility(8);
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 6.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    /* JADX INFO: renamed from: l */
    public void m6748l(CTInboxMessage cTInboxMessage, int i) {
        new Handler().postDelayed(new a(i, cTInboxMessage), 2000L);
    }

    /* JADX INFO: renamed from: m */
    public boolean m6749m() {
        return this.f5341p;
    }

    /* JADX INFO: renamed from: n */
    public void m6750n() {
        FrameLayout frameLayout = this.f5334i;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6751o() {
        m6740h().setVisibility(0);
        ImageView imageView = this.f5339n;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        FrameLayout frameLayout = this.f5334i;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m6752p() {
        FrameLayout frameLayout = this.f5334i;
        if (frameLayout != null) {
            frameLayout.post(new Runnable() { // from class: l.av3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71892a.f5334i.setVisibility(8);
                }
            });
        }
        ImageView imageView = this.f5339n;
        if (imageView != null) {
            imageView.post(new Runnable() { // from class: l.bv3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77390a.f5339n.setVisibility(8);
                }
            });
        }
        FrameLayout frameLayoutM6740h = m6740h();
        if (frameLayoutM6740h != null) {
            frameLayoutM6740h.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6753q(ImageView[] imageViewArr, int i, Context context, LinearLayout linearLayout) {
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView = new ImageView(context);
            imageViewArr[i2] = imageView;
            imageView.setVisibility(0);
            imageViewArr[i2].setImageDrawable(ywc0.m216334e(context.getResources(), q3c0.f152413n, null));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(8, 6, 4, 6);
            layoutParams.gravity = 17;
            if (linearLayout.getChildCount() < i) {
                linearLayout.addView(imageViewArr[i2], layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m6754s() {
        return this.f5337l.m6693B();
    }
}
