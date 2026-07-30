package p149l;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class w760 implements x4c<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a */
    private final C20819b f185026a;

    /* JADX INFO: renamed from: l.w760$a */
    @RequiresApi(21)
    public static final class C20818a implements x4c.InterfaceC21025a<ParcelFileDescriptor> {
        @Override // p149l.x4c.InterfaceC21025a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<ParcelFileDescriptor> mo112977a() {
            return ParcelFileDescriptor.class;
        }

        @Override // p149l.x4c.InterfaceC21025a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public x4c<ParcelFileDescriptor> mo112978b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new w760(parcelFileDescriptor);
        }
    }

    /* JADX INFO: renamed from: l.w760$b */
    @RequiresApi(21)
    public static final class C20819b {

        /* JADX INFO: renamed from: a */
        private final ParcelFileDescriptor f185027a;

        public C20819b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f185027a = parcelFileDescriptor;
        }

        /* JADX INFO: renamed from: a */
        public ParcelFileDescriptor m202011a() throws IOException {
            try {
                Os.lseek(this.f185027a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f185027a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @RequiresApi(21)
    public w760(ParcelFileDescriptor parcelFileDescriptor) {
        this.f185026a = new C20819b(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m202008b() {
        return true;
    }

    @Override // p149l.x4c
    @NonNull
    @RequiresApi(21)
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo112975a() throws IOException {
        return this.f185026a.m202011a();
    }

    @Override // p149l.x4c
    public void cleanup() {
    }
}
