package p149l;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/vay;", "", "", "title", "Landroid/view/View;", OMSTemplateModeType.view, "", FirebaseAnalytics.Param.INDEX, "<init>", "(Ljava/lang/String;Landroid/view/View;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "Landroid/view/View;", "c", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "I", "()I", "setIndex", "(I)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vay {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int index;

    public vay(@NotNull String str, @Nullable View view, int i) {
        str.getClass();
        this.title = str;
        this.view = view;
        this.index = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final View getView() {
        return this.view;
    }
}
