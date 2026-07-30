package kotlin.p122io;

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
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001a#B\u008b\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u00128\u0010\u0011\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fRF\u0010\u0011\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"¨\u0006$"}, m88121d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/Function1;", "", "onEnter", "", "onLeave", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "f", "Ljava/io/IOException;", "e", "onFail", "", "maxDepth", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/io/File;", "b", "Lkotlin/io/FileWalkDirection;", "c", "Lkotlin/jvm/functions/Function1;", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function2;", "I", "FileTreeWalkIterator", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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

    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\f\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0013"}, m88121d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk;)V", "", "computeNext", "()V", "root", "Lkotlin/io/FileTreeWalk$a;", "a", "(Ljava/io/File;)Lkotlin/io/FileTreeWalk$a;", "c", "()Ljava/io/File;", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$b;", "Ljava/util/ArrayDeque;", "state", "b", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class FileTreeWalkIterator extends AbstractIterator<File> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ArrayDeque<AbstractC15269b> state;

        @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f64141a;

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
                f64141a = iArr;
            }
        }

        /* JADX INFO: renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator$a */
        @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0015"}, m88121d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$a;", "Lkotlin/io/FileTreeWalk$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", Constants.INAPP_DATA_TAG, "I", "fileIndex", "e", "failed", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
        public final class C15265a extends AbstractC15268a {

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
            public final /* synthetic */ FileTreeWalkIterator f64146f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15265a(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                file.getClass();
                this.f64146f = fileTreeWalkIterator;
            }

            @Override // kotlin.p122io.FileTreeWalk.AbstractC15269b
            @Nullable
            /* JADX INFO: renamed from: b */
            public File mo88304b() {
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
        @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, m88121d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$b;", "Lkotlin/io/FileTreeWalk$b;", "Ljava/io/File;", "rootFile", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "visited", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
        @SourceDebugExtension
        public final class C15266b extends AbstractC15269b {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public boolean visited;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ FileTreeWalkIterator f64148c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15266b(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                file.getClass();
                this.f64148c = fileTreeWalkIterator;
            }

            @Override // kotlin.p122io.FileTreeWalk.AbstractC15269b
            @Nullable
            /* JADX INFO: renamed from: b */
            public File mo88304b() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        /* JADX INFO: renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator$c */
        @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$c;", "Lkotlin/io/FileTreeWalk$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", Constants.INAPP_DATA_TAG, "I", "fileIndex", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
        public final class C15267c extends AbstractC15268a {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public boolean rootVisited;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public File[] fileList;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public int fileIndex;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ FileTreeWalkIterator f64152e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15267c(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                file.getClass();
                this.f64152e = fileTreeWalkIterator;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.p122io.FileTreeWalk.AbstractC15269b
            @Nullable
            /* JADX INFO: renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File mo88304b() {
                Function2 function2;
                if (!this.rootVisited) {
                    Function1 function1 = FileTreeWalk.this.onEnter;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    this.rootVisited = true;
                    return getRoot();
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i = this.fileIndex;
                    fileArr.getClass();
                    if (i >= fileArr.length) {
                        Function1 function3 = FileTreeWalk.this.onLeave;
                        if (function3 != null) {
                            function3.invoke(getRoot());
                        }
                        return null;
                    }
                }
                if (this.fileList == null) {
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = FileTreeWalk.this.onFail) != null) {
                        function2.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.fileList;
                    if (fileArr2 != null) {
                        fileArr2.getClass();
                    }
                    Function1 function4 = FileTreeWalk.this.onLeave;
                    if (function4 != null) {
                        function4.invoke(getRoot());
                    }
                    return null;
                }
                File[] fileArr3 = this.fileList;
                fileArr3.getClass();
                int i2 = this.fileIndex;
                this.fileIndex = i2 + 1;
                return fileArr3[i2];
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque<AbstractC15269b> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (FileTreeWalk.this.start.isDirectory()) {
                arrayDeque.push(m88302a(FileTreeWalk.this.start));
            } else if (FileTreeWalk.this.start.isFile()) {
                arrayDeque.push(new C15266b(this, FileTreeWalk.this.start));
            } else {
                done();
            }
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC15268a m88302a(File root) {
            int i = WhenMappings.f64141a[FileTreeWalk.this.direction.ordinal()];
            if (i == 1) {
                return new C15267c(this, root);
            }
            if (i == 2) {
                return new C15265a(this, root);
            }
            nbr.m162172a();
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final File m88303c() {
            while (true) {
                AbstractC15269b abstractC15269bPeek = this.state.peek();
                if (abstractC15269bPeek == null) {
                    return null;
                }
                File fileMo88304b = abstractC15269bPeek.mo88304b();
                if (fileMo88304b == null) {
                    this.state.pop();
                } else {
                    if (Intrinsics.m88377d(fileMo88304b, abstractC15269bPeek.getRoot()) || !fileMo88304b.isDirectory() || this.state.size() >= FileTreeWalk.this.maxDepth) {
                        return fileMo88304b;
                    }
                    this.state.push(m88302a(fileMo88304b));
                }
            }
        }

        @Override // kotlin.collections.AbstractIterator
        public void computeNext() {
            File fileM88303c = m88303c();
            if (fileM88303c != null) {
                setNext(fileM88303c);
            } else {
                done();
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.io.FileTreeWalk$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"Lkotlin/io/FileTreeWalk$a;", "Lkotlin/io/FileTreeWalk$b;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static abstract class AbstractC15268a extends AbstractC15269b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC15268a(@NotNull File file) {
            super(file);
            file.getClass();
        }
    }

    /* JADX INFO: renamed from: kotlin.io.FileTreeWalk$b */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m88121d2 = {"Lkotlin/io/FileTreeWalk$b;", "", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "b", "()Ljava/io/File;", "a", "Ljava/io/File;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static abstract class AbstractC15269b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final File root;

        public AbstractC15269b(@NotNull File file) {
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
        public abstract File mo88304b();
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
