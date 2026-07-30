package p153l;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class zu0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public TextView f206082a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public TextClassifier f206083b;

    public zu0(TextView textView) {
        this.f206082a = (TextView) yn80.m216775e(textView);
    }

    @NonNull
    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: a */
    public TextClassifier m221590a() {
        TextClassifier textClassifier = this.f206083b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerM207916a = wu0.m207916a(this.f206082a.getContext().getSystemService(vu0.m202770a()));
        return textClassificationManagerM207916a != null ? textClassificationManagerM207916a.getTextClassifier() : TextClassifier.NO_OP;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: b */
    public void m221591b(@Nullable TextClassifier textClassifier) {
        this.f206083b = textClassifier;
    }
}
