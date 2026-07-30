package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, m88121d2 = {"Ll/uam;", "", "", "init", "()V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "b", "(Landroid/view/View$OnClickListener;)V", "Ll/pcj;", "", "func0", "setShowExitAreaFunc", "(Ll/pcj;)V", "a", "c", "Ll/oo2;", "roomData", "", "text", Constants.INAPP_DATA_TAG, "(Ll/oo2;Ljava/lang/String;)V", "e", "()Z", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface uam {
    /* JADX INFO: renamed from: a */
    void mo76788a();

    /* JADX INFO: renamed from: b */
    void mo76789b(@NotNull View.OnClickListener listener);

    /* JADX INFO: renamed from: c */
    void mo76790c();

    /* JADX INFO: renamed from: d */
    void mo76791d(@NotNull oo2 roomData, @NotNull String text);

    /* JADX INFO: renamed from: e */
    boolean mo76792e();

    void init();

    void setShowExitAreaFunc(@NotNull pcj<Boolean> func0);
}
