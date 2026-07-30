package com.immomo.svgaplayer.view;

import android.content.Context;
import android.util.AttributeSet;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m87232d2 = {"Lcom/immomo/svgaplayer/view/MomoSVGARVImageView;", "Lcom/immomo/svgaplayer/view/MomoSVGAImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mCallback", "Lcom/immomo/svgaplayer/SVGAAnimListenerAdapter;", "onAttachedToWindow", "", "setCallback", "listAdapter", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public class MomoSVGARVImageView extends MomoSVGAImageView {
    private SVGAAnimListenerAdapter mCallback;

    public MomoSVGARVImageView(@Nullable Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getMStopPlay()) {
            return;
        }
        loadSVGAAnimWithListener(getMResourceUrl(), getLoops(), this.mCallback, getAutoPlay());
    }

    @Override // com.immomo.svgaplayer.SVGAImageView
    public void setCallback(@Nullable SVGAAnimListenerAdapter listAdapter) {
        this.mCallback = listAdapter;
        super.setCallback(listAdapter);
    }

    public MomoSVGARVImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomoSVGARVImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MomoSVGARVImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
