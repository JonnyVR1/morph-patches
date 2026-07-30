package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class w6c {
    /* JADX INFO: renamed from: a */
    public static List<BLiveAbsData> m205088a(List<BLive> list) {
        return jyb.m147479J(list) ? new ArrayList() : new ArrayList(list);
    }

    /* JADX INFO: renamed from: b */
    public static List<BLiveAbsRoom> m205089b(List<BLiveRoom> list) {
        return jyb.m147479J(list) ? new ArrayList() : new ArrayList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.ObjectInputStream] */
    /* JADX INFO: renamed from: c */
    public static <T> T m205090c(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        T t = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        t = (T) objectInputStream.readObject();
                        bArr = objectInputStream;
                    } catch (Exception e) {
                        e = e;
                        CrashHelper.m82479c(e);
                        bArr = objectInputStream;
                    }
                } catch (Exception e2) {
                    e = e2;
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = 0;
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception e3) {
                        CrashHelper.m82479c(e3);
                    }
                    try {
                        bArr.close();
                        throw th;
                    } catch (Exception e4) {
                        CrashHelper.m82479c(e4);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e5) {
            e = e5;
            objectInputStream = null;
            byteArrayInputStream = null;
        } catch (Throwable th4) {
            byteArrayInputStream = null;
            th = th4;
            bArr = 0;
        }
        try {
            byteArrayInputStream.close();
        } catch (Exception e6) {
            CrashHelper.m82479c(e6);
        }
        try {
            bArr.close();
        } catch (Exception e7) {
            CrashHelper.m82479c(e7);
        }
        return t;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static byte[] m205091d(Object obj) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        byte[] byteArray = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        byteArray = byteArrayOutputStream.toByteArray();
                    } catch (Exception e) {
                        e = e;
                        CrashHelper.m82479c(e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    objectOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = null;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e3) {
                        CrashHelper.m82479c(e3);
                    }
                    try {
                        objectOutputStream.close();
                        throw th;
                    } catch (Exception e4) {
                        CrashHelper.m82479c(e4);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
            byteArrayOutputStream = null;
            objectOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            byteArrayOutputStream2.close();
            objectOutputStream.close();
            throw th;
        }
        try {
            byteArrayOutputStream.close();
        } catch (Exception e6) {
            CrashHelper.m82479c(e6);
        }
        try {
            objectOutputStream.close();
        } catch (Exception e7) {
            CrashHelper.m82479c(e7);
        }
        if (byteArray != null) {
            nsh0.m164608j("[live][square]", "bytes length: " + byteArray.length);
        }
        return byteArray;
    }
}
