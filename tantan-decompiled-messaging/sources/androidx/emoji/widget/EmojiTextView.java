package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import p149l.gye;
import p149l.mji0;

/* JADX INFO: loaded from: classes.dex */
public class EmojiTextView extends TextView {

    /* JADX INFO: renamed from: a */
    public gye f1829a;

    /* JADX INFO: renamed from: b */
    public boolean f1830b;

    public EmojiTextView(Context context) {
        super(context);
        m2453a();
    }

    private gye getEmojiTextViewHelper() {
        if (this.f1829a == null) {
            this.f1829a = new gye(this);
        }
        return this.f1829a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2453a() {
        if (this.f1830b) {
            return;
        }
        this.f1830b = true;
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

    public EmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2453a();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2453a();
    }
}
