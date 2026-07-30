package kotlin.p118io;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001a#B\u008b\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u00128\u0010\u0011\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fRF\u0010\u0011\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"¨\u0006$"}, m87232d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/Function1;", "", "onEnter", "", "onLeave", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "f", "Ljava/io/IOException;", "e", "onFail", "", "maxDepth", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/io/File;", "b", "Lkotlin/io/FileWalkDirection;", "c", "Lkotlin/jvm/functions/Function1;", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function2;", "I", "FileTreeWalkIterator", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class FileTreeWalk implements Sequence<File> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final FileWalkDirection direction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Function1<File, Boolean> onEnter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Function1<File, Unit> onLeave;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final Function2<File, IOException, Unit> onFail;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int maxDepth;

    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\f\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0013"}, m87232d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk;)V", "", "computeNext", "()V", "root", "Lkotlin/io/FileTreeWalk$a;", "a", "(Ljava/io/File;)Lkotlin/io/FileTreeWalk$a;", "c", "()Ljava/io/File;", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$b;", "Ljava/util/ArrayDeque;", "state", "b", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public final class FileTreeWalkIterator extends AbstractIterator<File> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ArrayDeque<AbstractC15162b> state;

        @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f63467a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f63467a = iArr;
            }
        }

        /* JADX INFO: renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator$a */
        @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0015"}, m87232d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$a;", "Lkotlin/io/FileTreeWalk$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", Constants.INAPP_DATA_TAG, "I", "fileIndex", "e", "failed", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        public final class C15158a extends AbstractC15161a {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public boolean rootVisited;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public File[] fileList;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public int fileIndex;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            public boolean failed;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ FileTreeWalkIterator f63472f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15158a(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                file.getClass();
                this.f63472f = fileTreeWalkIterator;
            }

            @Override // kotlin.p118io.FileTreeWalk.AbstractC15162b
            @Nullable
            /* JADX INFO: renamed from: b */
            public File mo87415b() {
                if (!this.failed && this.fileList == null) {
                    Function1 function1 = FileTreeWalk.this.onEnter;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = FileTreeWalk.this.onFail;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i = this.fileIndex;
                    fileArr.getClass();
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        fileArr2.getClass();
                        int i2 = this.fileIndex;
                        this.fileIndex = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                Function1 function3 = FileTreeWalk.this.onLeave;
                if (function3 != null) {
                    function3.invoke(getRoot());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator$b */
        @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, m87232d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$b;", "Lkotlin/io/FileTreeWalk$b;", "Ljava/io/File;", "rootFile", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "visited", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        @SourceDebugExtension
        public final class C15159b extends AbstractC15162b {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public boolean visited;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ FileTreeWalkIterator f63474c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15159b(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                file.getClass();
                this.f63474c = fileTreeWalkIterator;
            }

            @Override // kotlin.p118io.FileTreeWalk.AbstractC15162b
            @Nullable
            /* JADX INFO: renamed from: b */
            public File mo87415b() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        /* JADX INFO: renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator$c */
        @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$c;", "Lkotlin/io/FileTreeWalk$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", Constants.INAPP_DATA_TAG, "I", "fileIndex", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        public final class C15160c extends AbstractC15161a {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public boolean rootVisited;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public File[] fileList;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public int fileIndex;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ FileTreeWalkIterator f63478e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15160c(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                file.getClass();
                this.f63478e = fileTreeWalkIterator;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.p118io.FileTreeWalk.AbstractC15162b
            @org.jetbrains.annotations.Nullable
            /* JADX INFO: renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File mo87415b() {
                /*
                    r9 = this;
                    boolean r0 = r9.rootVisited
                    r1 = 0
                    if (r0 != 0) goto L28
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r9.f63478e
                    kotlin.io.FileTreeWalk r0 = kotlin.p118io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.p118io.FileTreeWalk.m87409d(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.getRoot()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.rootVisited = r0
                    java.io.File r9 = r9.getRoot()
                    return r9
                L28:
                    java.io.File[] r0 = r9.fileList
                    if (r0 == 0) goto L47
                    int r2 = r9.fileIndex
                    r0.getClass()
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r9.f63478e
                    kotlin.io.FileTreeWalk r0 = kotlin.p118io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.p118io.FileTreeWalk.m87411f(r0)
                    if (r0 == 0) goto L46
                    java.io.File r9 = r9.getRoot()
                    r0.invoke(r9)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.fileList
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r9.fileList = r0
                    if (r0 != 0) goto L76
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r9.f63478e
                    kotlin.io.FileTreeWalk r0 = kotlin.p118io.FileTreeWalk.this
                    kotlin.jvm.functions.Function2 r0 = kotlin.p118io.FileTreeWalk.m87410e(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.getRoot()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.getRoot()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.fileList
                    if (r0 == 0) goto L80
                    r0.getClass()
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r9.f63478e
                    kotlin.io.FileTreeWalk r0 = kotlin.p118io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.p118io.FileTreeWalk.m87411f(r0)
                    if (r0 == 0) goto L91
                    java.io.File r9 = r9.getRoot()
                    r0.invoke(r9)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.fileList
                    r0.getClass()
                    int r1 = r9.fileIndex
                    int r2 = r1 + 1
                    r9.fileIndex = r2
                    r9 = r0[r1]
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.FileTreeWalkIterator.C15160c.mo87415b():java.io.File");
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque<AbstractC15162b> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (FileTreeWalk.this.start.isDirectory()) {
                arrayDeque.push(m87413a(FileTreeWalk.this.start));
            } else if (FileTreeWalk.this.start.isFile()) {
                arrayDeque.push(new C15159b(this, FileTreeWalk.this.start));
            } else {
                done();
            }
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC15161a m87413a(File root) {
            int i = WhenMappings.f63467a[FileTreeWalk.this.direction.ordinal()];
            if (i == 1) {
                return new C15160c(this, root);
            }
            if (i == 2) {
                return new C15158a(this, root);
            }
            l9r.m149037a();
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final File m87414c() {
            while (true) {
                AbstractC15162b abstractC15162bPeek = this.state.peek();
                if (abstractC15162bPeek == null) {
                    return null;
                }
                File fileMo87415b = abstractC15162bPeek.mo87415b();
                if (fileMo87415b == null) {
                    this.state.pop();
                } else {
                    if (Intrinsics.m87488d(fileMo87415b, abstractC15162bPeek.getRoot()) || !fileMo87415b.isDirectory() || this.state.size() >= FileTreeWalk.this.maxDepth) {
                        return fileMo87415b;
                    }
                    this.state.push(m87413a(fileMo87415b));
                }
            }
        }

        @Override // kotlin.collections.AbstractIterator
        public void computeNext() {
            File fileM87414c = m87414c();
            if (fileM87414c != null) {
                setNext(fileM87414c);
            } else {
                done();
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.io.FileTreeWalk$a */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"Lkotlin/io/FileTreeWalk$a;", "Lkotlin/io/FileTreeWalk$b;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static abstract class AbstractC15161a extends AbstractC15162b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC15161a(@NotNull File file) {
            super(file);
            file.getClass();
        }
    }

    /* JADX INFO: renamed from: kotlin.io.FileTreeWalk$b */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m87232d2 = {"Lkotlin/io/FileTreeWalk$b;", "", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "b", "()Ljava/io/File;", "a", "Ljava/io/File;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static abstract class AbstractC15162b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final File root;

        public AbstractC15162b(@NotNull File file) {
            file.getClass();
            this.root = file;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final File getRoot() {
            return this.root;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public abstract File mo87415b();
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i2 & 32) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function2, Function2<? super File, ? super IOException, Unit> function3, int i) {
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = function1;
        this.onLeave = function2;
        this.onFail = function3;
        this.maxDepth = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        file.getClass();
        fileWalkDirection.getClass();
    }
}
