package com.p046p1.mobile.putong.feed.newui.photoalbum.p059ai;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import p147v.VImage;
import p147v.VLinear;
import p149l.b5c0;
import p149l.cxh;
import p149l.e51;
import p149l.o6c0;
import p149l.t100;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAiStoryHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f41409a;

    /* JADX INFO: renamed from: b */
    public VImage f41410b;

    /* JADX INFO: renamed from: c */
    public VLinear f41411c;

    /* JADX INFO: renamed from: d */
    public TextView f41412d;

    /* JADX INFO: renamed from: e */
    public TextView f41413e;

    /* JADX INFO: renamed from: f */
    public VImage f41414f;

    /* JADX INFO: renamed from: g */
    public Act f41415g;

    public FeedAiStoryHeadView(@NonNull Context context) {
        super(context);
        m63944c(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m63944c(Context context) {
        if (FeedModule.m60222H().mo30704Lk(User.ID_AI_STORY)) {
            setVisibility(8);
            return;
        }
        zvf0.m220402x("e_activity_ai_story", "p_discover_activity1");
        setPadding(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f));
        this.f41415g = (Act) context;
        LayoutInflater.from(context).inflate(o6c0.f142313x, this);
        m63945d();
        xdl0.m208329E0(this.f41409a, new View.OnClickListener() { // from class: l.ulg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177065a.m63947f(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m63945d() {
        this.f41409a = (RelativeLayout) findViewById(b5c0.f73466B);
        this.f41410b = (VImage) findViewById(b5c0.f73614u1);
        this.f41411c = (VLinear) findViewById(b5c0.f73613u0);
        this.f41412d = (TextView) findViewById(b5c0.f73611t1);
        this.f41413e = (TextView) findViewById(b5c0.f73608s1);
        this.f41414f = (VImage) findViewById(b5c0.f73626y1);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m63946e() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m63947f(View view) {
        zvf0.m220396r("e_activity_ai_story", "p_discover_activity1");
        e51.m114743H(this.f41415g, new Runnable() { // from class: l.vlg
            @Override // java.lang.Runnable
            public final void run() {
                this.f181948a.m63946e();
            }
        }, 1000L);
        cxh.m109100b(this.f41415g, Uri.parse("tantan://ai_story?from=moment_feed_top"));
    }

    public FeedAiStoryHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m63944c(context);
    }

    public FeedAiStoryHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63944c(context);
    }
}
