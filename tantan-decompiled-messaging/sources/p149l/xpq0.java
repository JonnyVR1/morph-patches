package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.tencent.mmkv.MMKV;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14748gn;
import com.xiaomi.push.C14759gy;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14742gh;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.service.C14837ah;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class xpq0 extends njq0.AbstractRunnableC18717c {

    /* JADX INFO: renamed from: c */
    private Context f193951c;

    /* JADX INFO: renamed from: d */
    private SharedPreferences f193952d;

    /* JADX INFO: renamed from: e */
    private C14837ah f193953e;

    public xpq0(Context context) {
        this.f193951c = context;
        this.f193952d = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        this.f193953e = C14837ah.m86477a(context);
    }

    /* JADX INFO: renamed from: b */
    private List<C14748gn> m210528b(File file) {
        RandomAccessFile randomAccessFile;
        FileInputStream fileInputStream;
        cpq0 cpq0VarM112925a = dpq0.m112924b().m112925a();
        String strMo108171a = cpq0VarM112925a == null ? "" : cpq0VarM112925a.mo108171a();
        FileLock fileLock = null;
        if (TextUtils.isEmpty(strMo108171a)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (gpq0.f103834a) {
            try {
                try {
                    try {
                        File file2 = new File(this.f193951c.getFilesDir(), "push_cdata.lock");
                        dxq0.m114022f(file2);
                        randomAccessFile = new RandomAccessFile(file2, "rw");
                        try {
                            FileLock fileLockLock = randomAccessFile.getChannel().lock();
                            try {
                                fileInputStream = new FileInputStream(file);
                                while (fileInputStream.read(bArr) == 4) {
                                    try {
                                        int iM143820a = jxq0.m143820a(bArr);
                                        byte[] bArr2 = new byte[iM143820a];
                                        if (fileInputStream.read(bArr2) != iM143820a) {
                                            break;
                                        }
                                        byte[] bArrM122627c = fpq0.m122627c(strMo108171a, bArr2);
                                        if (bArrM122627c != null && bArrM122627c.length != 0) {
                                            C14748gn c14748gn = new C14748gn();
                                            C14788m.m86276d(c14748gn, bArrM122627c);
                                            arrayList.add(c14748gn);
                                            m210530d(c14748gn);
                                        }
                                    } catch (Exception unused) {
                                        fileLock = fileLockLock;
                                        if (fileLock != null && fileLock.isValid()) {
                                            fileLock.release();
                                        }
                                        dxq0.m114018b(fileInputStream);
                                        dxq0.m114018b(randomAccessFile);
                                        return arrayList;
                                    } catch (Throwable th) {
                                        th = th;
                                        fileLock = fileLockLock;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        dxq0.m114018b(fileInputStream);
                                        dxq0.m114018b(randomAccessFile);
                                        throw th;
                                    }
                                }
                                if (fileLockLock != null && fileLockLock.isValid()) {
                                    fileLockLock.release();
                                }
                            } catch (Exception unused3) {
                                fileInputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream = null;
                            }
                        } catch (Exception unused4) {
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = null;
                        }
                    } catch (IOException unused5) {
                    }
                } catch (Exception unused6) {
                    randomAccessFile = null;
                    fileInputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile = null;
                    fileInputStream = null;
                }
                dxq0.m114018b(fileInputStream);
                dxq0.m114018b(randomAccessFile);
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private void m210529c() {
        SharedPreferences.Editor editorEdit = this.f193952d.edit();
        editorEdit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: d */
    private void m210530d(C14748gn c14748gn) {
        if (c14748gn.f62037a != EnumC14742gh.AppInstallList || c14748gn.f62038a.startsWith("same_")) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f193952d.edit();
        editorEdit.putLong("dc_job_result_time_4", c14748gn.f62036a);
        editorEdit.putString("dc_job_result_4", vlq0.m198839b(c14748gn.f62038a));
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: e */
    private boolean m210531e() {
        if (gkq0.m126695x(this.f193951c)) {
            return false;
        }
        if ((gkq0.m126697z(this.f193951c) || gkq0.m126696y(this.f193951c)) && !m210533g()) {
            return true;
        }
        return (gkq0.m126670A(this.f193951c) && !m210532f()) || gkq0.m126671B(this.f193951c);
    }

    /* JADX INFO: renamed from: f */
    private boolean m210532f() {
        if (!this.f193953e.m86489a(EnumC14745gk.Upload3GSwitch.m85646a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f193952d.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(MMKV.ExpireInDay, this.f193953e.m86481a(EnumC14745gk.Upload3GFrequency.m85646a(), 432000)));
    }

    /* JADX INFO: renamed from: g */
    private boolean m210533g() {
        if (!this.f193953e.m86489a(EnumC14745gk.Upload4GSwitch.m85646a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f193952d.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(MMKV.ExpireInDay, this.f193953e.m86481a(EnumC14745gk.Upload4GFrequency.m85646a(), 259200)));
    }

    @Override // p149l.njq0.AbstractRunnableC18717c
    /* JADX INFO: renamed from: a */
    public String mo86627a() {
        return "1";
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = new File(this.f193951c.getFilesDir(), "push_cdata.data");
        if (!gkq0.m126694w(this.f193951c)) {
            if (file.length() > 1863680) {
                file.delete();
                return;
            }
            return;
        }
        if (!m210531e() && file.exists()) {
            List<C14748gn> listM210528b = m210528b(file);
            if (!kxq0.m147805a(listM210528b)) {
                int size = listM210528b.size();
                if (size > 4000) {
                    listM210528b = listM210528b.subList(size - 4000, size);
                }
                C14759gy c14759gy = new C14759gy();
                c14759gy.m85845a(listM210528b);
                byte[] bArrM114024h = dxq0.m114024h(C14788m.m86277e(c14759gy));
                C14766he c14766he = new C14766he(User.ID_TEAM_ACCOUNT, false);
                c14766he.m85960c(EnumC14750gp.DataCollection.f62110a);
                c14766he.m85947a(bArrM114024h);
                cpq0 cpq0VarM112925a = dpq0.m112924b().m112925a();
                if (cpq0VarM112925a != null) {
                    cpq0VarM112925a.mo108172a(c14766he, EnumC14740gf.Notification, null);
                }
                m210529c();
            }
            file.delete();
        }
    }
}
