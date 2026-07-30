package p153l;

import com.tantanapp.sharelib.workmanager.WorkInfo;
import java.util.Observable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000 \b2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m88121d2 = {"Ll/n3f0;", "Ljava/util/Observable;", "<init>", "()V", "Lkotlin/Function0;", "", "a", "()Lkotlin/jvm/functions/Function0;", "Companion", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class n3f0 extends Observable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @JvmField
    public static final int f139966a;

    /* JADX INFO: renamed from: b */
    @JvmField
    public static final int f139967b;

    /* JADX INFO: renamed from: c */
    @JvmField
    public static final int f139968c;

    /* JADX INFO: renamed from: d */
    @JvmField
    public static final int f139969d;

    /* JADX INFO: renamed from: e */
    @JvmField
    public static final int f139970e;

    /* JADX INFO: renamed from: f */
    @JvmField
    public static final int f139971f;

    /* JADX INFO: renamed from: g */
    @JvmField
    public static final int f139972g;

    /* JADX INFO: renamed from: h */
    @JvmField
    public static final int f139973h;

    /* JADX INFO: renamed from: i */
    @JvmField
    public static final int f139974i;

    /* JADX INFO: renamed from: j */
    @JvmField
    public static final int f139975j;

    /* JADX INFO: renamed from: k */
    @JvmField
    public static final int f139976k;

    /* JADX INFO: renamed from: l */
    @JvmField
    public static final int f139977l;

    /* JADX INFO: renamed from: m */
    @JvmField
    public static final int f139978m;

    /* JADX INFO: renamed from: n */
    @JvmField
    public static final int f139979n;

    /* JADX INFO: renamed from: o */
    @JvmField
    public static final int f139980o;

    static {
        WorkInfo.State state = WorkInfo.State.RUNNING;
        f139966a = state.getValue() + 100;
        WorkInfo.State state2 = WorkInfo.State.SUCCEEDED;
        f139967b = state2.getValue() + 100;
        WorkInfo.State state3 = WorkInfo.State.FAILED;
        f139968c = state3.getValue() + 100;
        f139969d = state.getValue() + 200;
        f139970e = state2.getValue() + 200;
        f139971f = state3.getValue() + 200;
        f139972g = state.getValue() + 300;
        f139973h = state2.getValue() + 300;
        f139974i = state3.getValue() + 300;
        f139975j = state.getValue() + 400;
        f139976k = state2.getValue() + 400;
        f139977l = state3.getValue() + 400;
        f139978m = state.getValue() + 500;
        f139979n = state2.getValue() + 500;
        f139980o = state3.getValue() + 500;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract Function0<Boolean> mo161287a();

    /* JADX INFO: renamed from: l.n3f0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u0014\u0010\u001e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u0014\u0010 \u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\tR\u0014\u0010!\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\tR\u0014\u0010\"\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\tR\u0014\u0010#\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\tR\u0014\u0010$\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\tR\u0014\u0010%\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\tR\u0014\u0010&\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\tR\u0014\u0010'\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\t¨\u0006("}, m88121d2 = {"Ll/n3f0$a;", "", "<init>", "()V", "Ll/n3f0;", "a", "()Ll/n3f0;", "", "MODULE_GLOBAL", "Ljava/lang/String;", "", "STATUS_DOWNLOAD", "I", "STATUS_DOWNLOADED", "STATUS_DOWNLOADING", "STATUS_DOWNLOAD_ERROR", "STATUS_INSTALL", "STATUS_INSTALLED", "STATUS_INSTALLING", "STATUS_INSTALL_ERROR", "STATUS_STARTER", "STATUS_STARTER_ERROR", "STATUS_STARTER_RUNNING", "STATUS_STARTER_SUCCESS", "STATUS_UNZIP", "STATUS_UNZIPPED", "STATUS_UNZIPPING", "STATUS_UNZIP_ERROR", "STATUS_VALIDATE", "STATUS_VALIDATE_ERROR", "STATUS_VALIDATE_RUNNING", "STATUS_VALIDATE_SUCCESS", "TAG_DOWNLOAD", "TAG_INSTALL", "TAG_OBB_DOWNLOAD", "TAG_OBB_FILE_CHECK", "TAG_OBB_PREPARE", "TAG_STARTER", "TAG_UNZIP", "TAG_VALIDATE", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final n3f0 m161288a() {
            return r3f0.INSTANCE.m179611a();
        }

        public Companion() {
        }
    }
}
