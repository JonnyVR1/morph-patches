package androidx.emoji.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.o5c0;
import p149l.v9c0;
import p149l.z6c0;

/* JADX INFO: loaded from: classes.dex */
public class EmojiExtractTextLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ExtractButtonCompat f1825a;

    /* JADX INFO: renamed from: b */
    public EmojiExtractEditText f1826b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f1827c;

    /* JADX INFO: renamed from: d */
    public boolean f1828d;

    public EmojiExtractTextLayout(Context context) {
        super(context);
        m2452a(context, null, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m2452a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        if (this.f1828d) {
            return;
        }
        this.f1828d = true;
        setOrientation(0);
        View viewInflate = LayoutInflater.from(context).inflate(z6c0.f201905a, (ViewGroup) this, true);
        this.f1827c = (ViewGroup) viewInflate.findViewById(o5c0.f141889a);
        this.f1825a = (ExtractButtonCompat) viewInflate.findViewById(o5c0.f141890b);
        this.f1826b = (EmojiExtractEditText) viewInflate.findViewById(R.id.inputExtractEditText);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9c0.f180626c, i, i2);
            this.f1826b.setEmojiReplaceStrategy(typedArrayObtainStyledAttributes.getInteger(v9c0.f180627d, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int getEmojiReplaceStrategy() {
        return this.f1826b.getEmojiReplaceStrategy();
    }

    public void setEmojiReplaceStrategy(int i) {
        this.f1826b.setEmojiReplaceStrategy(i);
    }

    public EmojiExtractTextLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m2452a(context, attributeSet, 0, 0);
    }

    public EmojiExtractTextLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2452a(context, attributeSet, i, 0);
    }
}
