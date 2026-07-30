package p149l;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class tu0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public TextView f172108a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public TextClassifier f172109b;

    public tu0(TextView textView) {
        this.f172108a = (TextView) tf80.m188658e(textView);
    }

    @NonNull
    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: a */
    public TextClassifier m190674a() {
        TextClassifier textClassifier = this.f172109b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerM176494a = qu0.m176494a(this.f172108a.getContext().getSystemService(pu0.m171396a()));
        return textClassificationManagerM176494a != null ? textClassificationManagerM176494a.getTextClassifier() : TextClassifier.NO_OP;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: b */
    public void m190675b(@Nullable TextClassifier textClassifier) {
        this.f172109b = textClassifier;
    }
}
