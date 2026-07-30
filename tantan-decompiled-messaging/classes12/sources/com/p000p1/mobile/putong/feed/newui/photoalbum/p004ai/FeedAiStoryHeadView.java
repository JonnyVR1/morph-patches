package com.p000p1.mobile.putong.feed.newui.photoalbum.p004ai;

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
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import l.e51;
import l.t100;
import l.xdl0;
import l.zvf0;
import p007l.b5c0;
import p007l.cxh;
import p007l.o6c0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAiStoryHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f2870a;

    /* JADX INFO: renamed from: b */
    public VImage f2871b;

    /* JADX INFO: renamed from: c */
    public VLinear f2872c;

    /* JADX INFO: renamed from: d */
    public TextView f2873d;

    /* JADX INFO: renamed from: e */
    public TextView f2874e;

    /* JADX INFO: renamed from: f */
    public VImage f2875f;

    /* JADX INFO: renamed from: g */
    public Act f2876g;

    public FeedAiStoryHeadView(@NonNull Context context) {
        super(context);
        m4983c(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m4983c(Context context) {
        if (FeedModule.m1140H().Lk(User.ID_AI_STORY)) {
            setVisibility(8);
            return;
        }
        zvf0.x("e_activity_ai_story", "p_discover_activity1");
        setPadding(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f));
        this.f2876g = (Act) context;
        LayoutInflater.from(context).inflate(o6c0.f11332x, this);
        m4984d();
        xdl0.E0(this.f2870a, new View.OnClickListener() { // from class: l.ulg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13856a.m4986f(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m4984d() {
        this.f2870a = (RelativeLayout) findViewById(b5c0.f5947B);
        this.f2871b = findViewById(b5c0.f6095u1);
        this.f2872c = findViewById(b5c0.f6094u0);
        this.f2873d = (TextView) findViewById(b5c0.f6092t1);
        this.f2874e = (TextView) findViewById(b5c0.f6089s1);
        this.f2875f = findViewById(b5c0.f6107y1);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m4985e() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m4986f(View view) {
        zvf0.r("e_activity_ai_story", "p_discover_activity1");
        e51.H(this.f2876g, new Runnable() { // from class: l.vlg
            @Override // java.lang.Runnable
            public final void run() {
                this.f14229a.m4985e();
            }
        }, 1000L);
        cxh.m9252b(this.f2876g, Uri.parse("tantan://ai_story?from=moment_feed_top"));
    }

    public FeedAiStoryHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m4983c(context);
    }

    public FeedAiStoryHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4983c(context);
    }
}
