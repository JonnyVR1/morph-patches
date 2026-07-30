package com.p051p1.mobile.putong.feed.newui.photoalbum.p064ai;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.l51;
import p153l.qa00;
import p153l.ryh;
import p153l.tec0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAiStoryHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f42257a;

    /* JADX INFO: renamed from: b */
    public VImage f42258b;

    /* JADX INFO: renamed from: c */
    public VLinear f42259c;

    /* JADX INFO: renamed from: d */
    public TextView f42260d;

    /* JADX INFO: renamed from: e */
    public TextView f42261e;

    /* JADX INFO: renamed from: f */
    public VImage f42262f;

    /* JADX INFO: renamed from: g */
    public Act f42263g;

    public FeedAiStoryHeadView(@NonNull Context context) {
        super(context);
        m65127c(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m65127c(Context context) {
        if (FeedModule.m61406H().mo31707Lk(User.ID_AI_STORY)) {
            setVisibility(8);
            return;
        }
        i4g0.m138526x("e_activity_ai_story", "p_discover_activity1");
        setPadding(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f));
        this.f42263g = (Act) context;
        LayoutInflater.from(context).inflate(tec0.f173782x, this);
        m65128d();
        bnl0.m105509E0(this.f42257a, new View.OnClickListener() { // from class: l.jng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121851a.m65130f(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m65128d() {
        this.f42257a = (RelativeLayout) findViewById(hdc0.f108819B);
        this.f42258b = (VImage) findViewById(hdc0.f108967u1);
        this.f42259c = (VLinear) findViewById(hdc0.f108966u0);
        this.f42260d = (TextView) findViewById(hdc0.f108964t1);
        this.f42261e = (TextView) findViewById(hdc0.f108961s1);
        this.f42262f = (VImage) findViewById(hdc0.f108979y1);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m65129e() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m65130f(View view) {
        i4g0.m138520r("e_activity_ai_story", "p_discover_activity1");
        l51.m152888H(this.f42263g, new Runnable() { // from class: l.kng
            @Override // java.lang.Runnable
            public final void run() {
                this.f127591a.m65129e();
            }
        }, 1000L);
        ryh.m183607b(this.f42263g, Uri.parse("tantan://ai_story?from=moment_feed_top"));
    }

    public FeedAiStoryHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65127c(context);
    }

    public FeedAiStoryHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65127c(context);
    }
}
