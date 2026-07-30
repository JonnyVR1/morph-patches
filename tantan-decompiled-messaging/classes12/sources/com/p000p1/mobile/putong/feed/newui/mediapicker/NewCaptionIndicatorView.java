package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewCaptionIndicatorView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2090b;
import com.p1.mobile.putong.app.PutongAct;
import java.util.ArrayList;
import l.t100;
import p007l.b5c0;
import p007l.f3c0;
import p007l.oe40;
import p007l.p6j0;
import p007l.u2h;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewCaptionIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f1927a;

    /* JADX INFO: renamed from: b */
    public ImageView f1928b;

    public NewCaptionIndicatorView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3458a(int i, PutongAct putongAct, View view) {
        p6j0.m12912b("e_add_new_photo", "p_moment_post", new p6j0.C2456a[0]);
        if (i > 0) {
            putongAct.pickImagesWithInstaPicker(9 - i);
        } else {
            oe40.m12571e0(putongAct);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3459b(final PutongAct putongAct, ArrayList<Media> arrayList, C2090b c2090b) {
        final int size = arrayList.size();
        this.f1927a.setOnClickListener(new View.OnClickListener() { // from class: l.di20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCaptionIndicatorView.m3458a(size, putongAct, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1927a = findViewById(b5c0.f6022a);
        ImageView imageView = (ImageView) findViewById(b5c0.f6086r1);
        this.f1928b = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = NewCaptionMediaView.f1932h - t100.d(6.0f);
        layoutParams.height = NewCaptionMediaView.f1932h - t100.d(6.0f);
        this.f1928b.setLayoutParams(layoutParams);
        if (u2h.m14723h()) {
            this.f1927a.setBackground(null);
            this.f1928b.setBackground(null);
            this.f1928b.setImageResource(f3c0.f7668N3);
        }
    }

    public NewCaptionIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewCaptionIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
