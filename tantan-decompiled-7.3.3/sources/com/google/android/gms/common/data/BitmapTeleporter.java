package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p153l.mnd0;
import p153l.wtq0;
import p153l.yzv;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class(creator = "BitmapTeleporterCreator")
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();

    @SafeParcelable.VersionField(m12520id = 1)
    final int zaa;

    @Nullable
    @SafeParcelable.Field(m12517id = 2)
    ParcelFileDescriptor zab;

    @SafeParcelable.Field(m12517id = 3)
    final int zac;

    @Nullable
    private Bitmap zad;
    private boolean zae;
    private File zaf;

    @KeepForSdk
    public BitmapTeleporter(@NonNull Bitmap bitmap) {
        this.zaa = 1;
        this.zab = null;
        this.zac = 0;
        this.zad = bitmap;
        this.zae = true;
    }

    private static final void zaa(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Nullable
    @KeepForSdk
    public Bitmap get() {
        if (!this.zae) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.checkNotNull(this.zab)));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    Bitmap.Config configValueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    zaa(dataInputStream);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, configValueOf);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
                    this.zad = bitmapCreateBitmap;
                    this.zae = true;
                } catch (IOException e) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e);
                }
            } catch (Throwable th) {
                zaa(dataInputStream);
                throw th;
            }
        }
        return this.zad;
    }

    @KeepForSdk
    public void release() {
        if (this.zae) {
            return;
        }
        try {
            ((ParcelFileDescriptor) Preconditions.checkNotNull(this.zab)).close();
        } catch (IOException unused) {
        }
    }

    @KeepForSdk
    public void setTempDir(@NonNull File file) {
        if (file != null) {
            this.zaf = file;
        } else {
            mnd0.m159157a("Cannot set null temp directory");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        if (this.zab == null) {
            Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(this.zad);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            File file = this.zaf;
            if (file == null) {
                wtq0.m207906a("setTempDir() must be called before writing this object to a parcel");
                return;
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.zab = ParcelFileDescriptor.open(fileCreateTempFile, SQLiteDatabase.CREATE_IF_NECESSARY);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(bArrArray.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(bArrArray);
                            zaa(dataOutputStream);
                        } catch (Throwable th) {
                            zaa(dataOutputStream);
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new IllegalStateException("Could not write into unlinked file", e);
                    }
                } catch (FileNotFoundException unused) {
                    wtq0.m207906a("Temporary file is somehow already deleted");
                    return;
                }
            } catch (IOException e2) {
                yzv.m218057a("Could not create temporary file", e2);
                return;
            }
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i | 1, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        this.zab = null;
    }

    @SafeParcelable.Constructor
    public BitmapTeleporter(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(m12518id = 3) int i2) {
        this.zaa = i;
        this.zab = parcelFileDescriptor;
        this.zac = i2;
        this.zad = null;
        this.zae = false;
    }
}
