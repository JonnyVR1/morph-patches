package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC1064a<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a */
    private final InternalRewinder f4379a;

    @RequiresApi(21)
    public static final class InternalRewinder {

        /* JADX INFO: renamed from: a */
        private final ParcelFileDescriptor f4380a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f4380a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f4380a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f4380a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    @RequiresApi(21)
    public static final class C1063a implements InterfaceC1064a.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.InterfaceC1064a.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<ParcelFileDescriptor> mo5371a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1064a.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC1064a<ParcelFileDescriptor> mo5372b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f4379a = new InternalRewinder(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5368b() {
        return true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1064a
    @NonNull
    @RequiresApi(21)
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo5369a() throws IOException {
        return this.f4379a.rewind();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1064a
    public void cleanup() {
    }
}
