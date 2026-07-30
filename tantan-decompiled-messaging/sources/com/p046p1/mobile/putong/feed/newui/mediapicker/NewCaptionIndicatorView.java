package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewCaptionIndicatorView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11246b;
import java.util.ArrayList;
import p149l.b5c0;
import p149l.f3c0;
import p149l.oe40;
import p149l.p6j0;
import p149l.t100;
import p149l.u2h;

/* JADX INFO: loaded from: classes12.dex */
public class NewCaptionIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f40466a;

    /* JADX INFO: renamed from: b */
    public ImageView f40467b;

    public NewCaptionIndicatorView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m62456a(int i, PutongAct putongAct, View view) {
        p6j0.m167668b("e_add_new_photo", "p_moment_post", new p6j0.C19147a[0]);
        if (i > 0) {
            putongAct.pickImagesWithInstaPicker(9 - i);
        } else {
            oe40.m163834e0(putongAct);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m62457b(final PutongAct putongAct, ArrayList<Media> arrayList, C11246b c11246b) {
        final int size = arrayList.size();
        this.f40466a.setOnClickListener(new View.OnClickListener() { // from class: l.di20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCaptionIndicatorView.m62456a(size, putongAct, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f40466a = findViewById(b5c0.f73541a);
        ImageView imageView = (ImageView) findViewById(b5c0.f73605r1);
        this.f40467b = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = NewCaptionMediaView.f40471h - t100.m186890d(6.0f);
        layoutParams.height = NewCaptionMediaView.f40471h - t100.m186890d(6.0f);
        this.f40467b.setLayoutParams(layoutParams);
        if (u2h.m191499h()) {
            this.f40466a.setBackground(null);
            this.f40467b.setBackground(null);
            this.f40467b.setImageResource(f3c0.f94385N3);
        }
    }

    public NewCaptionIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewCaptionIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
