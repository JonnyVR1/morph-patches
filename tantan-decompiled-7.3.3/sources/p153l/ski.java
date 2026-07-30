package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@WorkerThread
public class ski {

    /* JADX INFO: renamed from: a */
    private final CleverTapInstanceConfig f169286a;

    /* JADX INFO: renamed from: b */
    private final Context f169287b;

    public ski(@NonNull Context context, @NonNull CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f169287b = context;
        this.f169286a = cleverTapInstanceConfig;
    }

    /* JADX INFO: renamed from: a */
    public void m186451a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            synchronized (ski.class) {
                try {
                    File file = new File(this.f169287b.getFilesDir(), str);
                    if (file.exists()) {
                        boolean zDelete = file.delete();
                        CleverTapInstanceConfig cleverTapInstanceConfig = this.f169286a;
                        if (zDelete) {
                            cleverTapInstanceConfig.getLogger().verbose(this.f169286a.getAccountId(), "File Deleted:" + str);
                        } else {
                            cleverTapInstanceConfig.getLogger().verbose(this.f169286a.getAccountId(), "Failed to delete file" + str);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            this.f169286a.getLogger().verbose(this.f169286a.getAccountId(), "deleteFile: failed: " + str, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public String m186452b(String str) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Exception e;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(new File(this.f169287b.getFilesDir() + "/" + str));
            try {
                StringBuilder sb = new StringBuilder();
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    fileInputStream.close();
                                    String string = sb.toString();
                                    fileInputStream.close();
                                    inputStreamReader.close();
                                    bufferedReader.close();
                                    return string;
                                }
                                sb.append(line);
                            } catch (Exception e2) {
                                e = e2;
                                this.f169286a.getLogger().verbose(this.f169286a.getAccountId(), "readFromFile: failed for " + str, e);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (bufferedReader != null) {
                                    return "";
                                }
                                bufferedReader.close();
                                return "";
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        th = th;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader = null;
                    e = e;
                    this.f169286a.getLogger().verbose(this.f169286a.getAccountId(), "readFromFile: failed for " + str, e);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (bufferedReader != null) {
                        return "";
                    }
                    bufferedReader.close();
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            } catch (Exception e4) {
                e = e4;
                inputStreamReader = null;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                bufferedReader = null;
            }
        } catch (Exception e5) {
            inputStreamReader = null;
            bufferedReader = null;
            e = e5;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m186453c(String str, String str2, JSONObject jSONObject) throws IOException {
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        synchronized (ski.class) {
                            try {
                                File file = new File(this.f169287b.getFilesDir(), str);
                                if (!file.exists() && !file.mkdir()) {
                                    return;
                                }
                                FileWriter fileWriter2 = new FileWriter(new File(file, str2), false);
                                try {
                                    fileWriter2.append((CharSequence) jSONObject.toString());
                                    fileWriter2.flush();
                                    fileWriter2.close();
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    fileWriter = fileWriter2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    this.f169286a.getLogger().verbose(this.f169286a.getAccountId(), "writeJsonToFile: failed for dir=" + str + ", file=" + str2, e);
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                }
            } catch (Throwable th3) {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                throw th3;
            }
        }
    }
}
