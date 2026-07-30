package p153l;

import android.opengl.GLES20;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class iyk {
    /* JADX INFO: renamed from: a */
    public static JSONObject m142657a() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLDisplay eGLDisplayEglGetDisplay;
        EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        JSONObject jSONObject = new JSONObject();
        EGL10 egl10 = null;
        try {
            EGL10 egl11 = (EGL10) EGLContext.getEGL();
            try {
                eGLDisplayEglGetDisplay = egl11.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                try {
                    if (!egl11.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                        JSONObject jSONObjectM142658b = m142658b(jSONObject, "", "", "");
                        if (eGLDisplayEglGetDisplay != null) {
                            try {
                                egl11.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext2);
                            } catch (Throwable unused) {
                            }
                        }
                        if (eGLDisplayEglGetDisplay != null) {
                            try {
                                egl11.eglTerminate(eGLDisplayEglGetDisplay);
                            } catch (Throwable unused2) {
                            }
                        }
                        return jSONObjectM142658b;
                    }
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr = new int[1];
                    if (egl11.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344}, eGLConfigArr, 1, iArr) && iArr[0] != 0) {
                        EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], eGLContext2, new int[]{12440, 2, 12344});
                        try {
                            EGLSurface eGLSurfaceEglCreatePbufferSurface = egl11.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344});
                            if (egl11.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                                JSONObject jSONObjectM142658b2 = m142658b(jSONObject, m142659c(7936), m142659c(7937), m142659c(7938));
                                if (eGLDisplayEglGetDisplay != null) {
                                    try {
                                        egl11.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext2);
                                    } catch (Throwable unused3) {
                                    }
                                }
                                if (eGLDisplayEglGetDisplay != null && eGLSurfaceEglCreatePbufferSurface != null) {
                                    try {
                                        egl11.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                    } catch (Throwable unused4) {
                                    }
                                }
                                if (eGLDisplayEglGetDisplay != null && eGLContextEglCreateContext != null) {
                                    try {
                                        egl11.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                    } catch (Throwable unused5) {
                                    }
                                }
                                if (eGLDisplayEglGetDisplay != null) {
                                    try {
                                        egl11.eglTerminate(eGLDisplayEglGetDisplay);
                                    } catch (Throwable unused6) {
                                    }
                                }
                                return jSONObjectM142658b2;
                            }
                            JSONObject jSONObjectM142658b3 = m142658b(jSONObject, "", "", "");
                            if (eGLDisplayEglGetDisplay != null) {
                                try {
                                    egl11.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext2);
                                } catch (Throwable unused7) {
                                }
                            }
                            if (eGLDisplayEglGetDisplay != null && eGLSurfaceEglCreatePbufferSurface != null) {
                                try {
                                    egl11.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                } catch (Throwable unused8) {
                                }
                            }
                            if (eGLDisplayEglGetDisplay != null && eGLContextEglCreateContext != null) {
                                try {
                                    egl11.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                } catch (Throwable unused9) {
                                }
                            }
                            if (eGLDisplayEglGetDisplay != null) {
                                try {
                                    egl11.eglTerminate(eGLDisplayEglGetDisplay);
                                } catch (Throwable unused10) {
                                }
                            }
                            return jSONObjectM142658b3;
                        } catch (Throwable unused11) {
                            eGLSurface = null;
                            egl10 = egl11;
                            eGLContext = eGLContextEglCreateContext;
                            try {
                                return m142658b(jSONObject, "", "", "");
                            } finally {
                                if (egl10 != null && eGLDisplayEglGetDisplay != null) {
                                    try {
                                        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext2);
                                    } catch (Throwable unused12) {
                                    }
                                }
                                if (egl10 != null && eGLDisplayEglGetDisplay != null && eGLSurface != null) {
                                    try {
                                        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurface);
                                    } catch (Throwable unused13) {
                                    }
                                }
                                if (egl10 != null && eGLDisplayEglGetDisplay != null && eGLContext != null) {
                                    try {
                                        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContext);
                                    } catch (Throwable unused14) {
                                    }
                                }
                                if (egl10 != null && eGLDisplayEglGetDisplay != null) {
                                    try {
                                        egl10.eglTerminate(eGLDisplayEglGetDisplay);
                                    } catch (Throwable unused15) {
                                    }
                                }
                            }
                        }
                    }
                    JSONObject jSONObjectM142658b4 = m142658b(jSONObject, "", "", "");
                    if (eGLDisplayEglGetDisplay != null) {
                        try {
                            egl11.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext2);
                        } catch (Throwable unused16) {
                        }
                    }
                    if (eGLDisplayEglGetDisplay != null) {
                        try {
                            egl11.eglTerminate(eGLDisplayEglGetDisplay);
                        } catch (Throwable unused17) {
                        }
                    }
                    return jSONObjectM142658b4;
                } catch (Throwable unused18) {
                    eGLSurface = null;
                    egl10 = egl11;
                    eGLContext = null;
                }
            } catch (Throwable unused19) {
                eGLSurface = null;
                eGLDisplayEglGetDisplay = null;
                egl10 = egl11;
                eGLContext = null;
            }
        } catch (Throwable unused20) {
            eGLSurface = null;
            eGLContext = null;
            eGLDisplayEglGetDisplay = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static JSONObject m142658b(JSONObject jSONObject, String str, String str2, String str3) {
        try {
            String strM181611a = riw.m181611a(new byte[]{87, 10, 110, 65, 4, 8, 84, 9, 67});
            if (str == null) {
                str = "";
            }
            jSONObject.put(strM181611a, str);
            String strM181611a2 = riw.m181611a(new byte[]{87, 10, 110, 69, 4, 8, 84, 3, 67, 82, 19});
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put(strM181611a2, str2);
            String strM181611a3 = riw.m181611a(new byte[]{87, 10, 110, 65, 4, 20, 67, 15, 94, 89});
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put(strM181611a3, str3);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    private static String m142659c(int i) {
        try {
            String strGlGetString = GLES20.glGetString(i);
            return strGlGetString == null ? "" : strGlGetString;
        } catch (Throwable unused) {
            return "";
        }
    }
}
