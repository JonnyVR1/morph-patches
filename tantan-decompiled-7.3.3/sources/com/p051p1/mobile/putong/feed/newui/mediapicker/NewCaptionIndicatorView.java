package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewCaptionIndicatorView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11409b;
import java.util.ArrayList;
import p153l.cn40;
import p153l.hdc0;
import p153l.j4h;
import p153l.lbc0;
import p153l.qa00;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class NewCaptionIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f41314a;

    /* JADX INFO: renamed from: b */
    public ImageView f41315b;

    public NewCaptionIndicatorView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m63639a(int i, PutongAct putongAct, View view) {
        tfj0.m190939b("e_add_new_photo", "p_moment_post", new tfj0.C20302a[0]);
        if (i > 0) {
            putongAct.pickImagesWithInstaPicker(9 - i);
        } else {
            cn40.m111384e0(putongAct);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m63640b(final PutongAct putongAct, ArrayList<Media> arrayList, C11409b c11409b) {
        final int size = arrayList.size();
        this.f41314a.setOnClickListener(new View.OnClickListener() { // from class: l.nq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCaptionIndicatorView.m63639a(size, putongAct, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f41314a = findViewById(hdc0.f108894a);
        ImageView imageView = (ImageView) findViewById(hdc0.f108958r1);
        this.f41315b = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = NewCaptionMediaView.f41319h - qa00.m175859d(6.0f);
        layoutParams.height = NewCaptionMediaView.f41319h - qa00.m175859d(6.0f);
        this.f41315b.setLayoutParams(layoutParams);
        if (j4h.m143424h()) {
            this.f41314a.setBackground(null);
            this.f41315b.setBackground(null);
            this.f41315b.setImageResource(lbc0.f130903N3);
        }
    }

    public NewCaptionIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewCaptionIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
