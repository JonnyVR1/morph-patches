package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.Button;
import p149l.gye;
import p149l.mji0;

/* JADX INFO: loaded from: classes.dex */
public class EmojiButton extends Button {

    /* JADX INFO: renamed from: a */
    public gye f1819a;

    /* JADX INFO: renamed from: b */
    public boolean f1820b;

    public EmojiButton(Context context) {
        super(context);
        m2449a();
    }

    private gye getEmojiTextViewHelper() {
        if (this.f1819a == null) {
            this.f1819a = new gye(this);
        }
        return this.f1819a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2449a() {
        if (this.f1820b) {
            return;
        }
        this.f1820b = true;
        getEmojiTextViewHelper().m128701c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m128700b(z);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mji0.m154823q(this, callback));
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m128699a(inputFilterArr));
    }

    public EmojiButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2449a();
    }

    public EmojiButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2449a();
    }
}
