package com.bytedance.realx.base;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class GPUUtil {
    private static String glRenderer = "unknown";
    private static String glVendor = "unknown";
    private static boolean initialized = false;

    /* JADX WARN: Code duplicated, block: B:102:0x0144  */
    /* JADX WARN: Code duplicated, block: B:104:0x014d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0156  */
    /* JADX WARN: Code duplicated, block: B:112:0x015f  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX WARN: Code duplicated, block: B:86:0x011e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x0130  */
    /* JADX WARN: Code duplicated, block: B:96:0x0139  */
    @RequiresApi(api = 17)
    private static void Initialize() throws Throwable {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        boolean z;
        EGLSurface eGLSurface2;
        initialized = true;
        boolean z2 = false;
        EGLDisplay eGLDisplay = null;
        try {
            EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
            if (eGLContextEglGetCurrentContext != null) {
                try {
                    if (eGLContextEglGetCurrentContext == EGL14.EGL_NO_CONTEXT) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Exception e) {
                    e = e;
                    eGLContext = eGLContextEglGetCurrentContext;
                    eGLSurface = null;
                    try {
                        Log.e("gpm", e.toString());
                        if (z2) {
                            EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                            if (eGLSurface != null) {
                                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                            }
                            if (eGLContext != null) {
                                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                            }
                            if (eGLDisplay != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z2) {
                            EGLSurface eGLSurface4 = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface4, eGLSurface4, EGL14.EGL_NO_CONTEXT);
                            if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
                                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                            }
                            if (eGLContext != null && eGLContext != EGL14.EGL_NO_CONTEXT) {
                                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                            }
                            if (eGLDisplay != null && eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                                EGL14.eglTerminate(eGLDisplay);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    eGLContext = eGLContextEglGetCurrentContext;
                    eGLSurface = null;
                    if (z2) {
                        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface5, eGLSurface5, EGL14.EGL_NO_CONTEXT);
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        }
                        if (eGLContext != null) {
                            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                        }
                        if (eGLDisplay != null) {
                            EGL14.eglTerminate(eGLDisplay);
                        }
                    }
                    throw th;
                }
            } else {
                z = true;
            }
            if (z) {
                try {
                    EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                    if (eGLDisplayEglGetDisplay != null) {
                        try {
                            if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                                int[] iArr = new int[2];
                                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                                    throw new Exception("eglInitialize error");
                                }
                                int[] iArr2 = new int[1];
                                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                                if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                                    throw new Exception("eglChooseConfig error");
                                }
                                if (iArr2[0] <= 0) {
                                    throw new Exception("no egl config chosen");
                                }
                                EGLConfig eGLConfig = eGLConfigArr[0];
                                eGLContextEglGetCurrentContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                                if (eGLContextEglGetCurrentContext == null || eGLContextEglGetCurrentContext == EGL14.EGL_NO_CONTEXT) {
                                    throw new Exception("eglCreateContext error");
                                }
                                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                                if (eGLSurfaceEglCreatePbufferSurface == null || eGLSurfaceEglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                                    throw new Exception("eglCreatePbufferSurface error");
                                }
                                if (!EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglGetCurrentContext)) {
                                    throw new Exception("eglMakeCurrent error");
                                }
                                eGLSurface2 = eGLSurfaceEglCreatePbufferSurface;
                                eGLDisplay = eGLDisplayEglGetDisplay;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z2 = z;
                            eGLContext = eGLContextEglGetCurrentContext;
                            eGLSurface = null;
                            eGLDisplay = eGLDisplayEglGetDisplay;
                            Log.e("gpm", e.toString());
                            if (z2) {
                                EGLSurface eGLSurface6 = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface6, eGLSurface6, EGL14.EGL_NO_CONTEXT);
                                if (eGLSurface != null) {
                                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                                }
                                if (eGLContext != null) {
                                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                                }
                                if (eGLDisplay != null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z2 = z;
                            eGLContext = eGLContextEglGetCurrentContext;
                            eGLSurface = null;
                            eGLDisplay = eGLDisplayEglGetDisplay;
                            if (z2) {
                                EGLSurface eGLSurface7 = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface7, eGLSurface7, EGL14.EGL_NO_CONTEXT);
                                if (eGLSurface != null) {
                                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                                }
                                if (eGLContext != null) {
                                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                                }
                                if (eGLDisplay != null) {
                                    EGL14.eglTerminate(eGLDisplay);
                                }
                            }
                            throw th;
                        }
                    }
                    throw new Exception("eglGetDisplay error");
                } catch (Exception e3) {
                    e = e3;
                    z2 = z;
                    eGLContext = eGLContextEglGetCurrentContext;
                    eGLSurface = null;
                    Log.e("gpm", e.toString());
                    if (z2) {
                        EGLSurface eGLSurface8 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface8, eGLSurface8, EGL14.EGL_NO_CONTEXT);
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        }
                        if (eGLContext != null) {
                            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                        }
                        if (eGLDisplay != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z2 = z;
                    eGLContext = eGLContextEglGetCurrentContext;
                    eGLSurface = null;
                    if (z2) {
                        EGLSurface eGLSurface9 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface9, eGLSurface9, EGL14.EGL_NO_CONTEXT);
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        }
                        if (eGLContext != null) {
                            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                        }
                        if (eGLDisplay != null) {
                            EGL14.eglTerminate(eGLDisplay);
                        }
                    }
                    throw th;
                }
            }
            eGLSurface2 = null;
            try {
                glVendor = GLES20.glGetString(7936);
                glRenderer = GLES20.glGetString(7937);
                if (z) {
                    EGLSurface eGLSurface10 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface10, eGLSurface10, EGL14.EGL_NO_CONTEXT);
                    if (eGLSurface2 != null && eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplay, eGLSurface2);
                    }
                    if (eGLContextEglGetCurrentContext != null && eGLContextEglGetCurrentContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                    }
                    if (eGLDisplay == null || eGLDisplay == EGL14.EGL_NO_DISPLAY) {
                        return;
                    }
                    EGL14.eglTerminate(eGLDisplay);
                }
            } catch (Exception e4) {
                e = e4;
                EGLContext eGLContext2 = eGLContextEglGetCurrentContext;
                eGLSurface = eGLSurface2;
                z2 = z;
                eGLContext = eGLContext2;
                Log.e("gpm", e.toString());
                if (z2) {
                    EGLSurface eGLSurface11 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface11, eGLSurface11, EGL14.EGL_NO_CONTEXT);
                    if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                    }
                    if (eGLContext != null && eGLContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                    }
                    if (eGLDisplay != null || eGLDisplay == EGL14.EGL_NO_DISPLAY) {
                        return;
                    }
                    EGL14.eglTerminate(eGLDisplay);
                }
            } catch (Throwable th5) {
                th = th5;
                EGLContext eGLContext3 = eGLContextEglGetCurrentContext;
                eGLSurface = eGLSurface2;
                z2 = z;
                eGLContext = eGLContext3;
                if (z2) {
                    EGLSurface eGLSurface12 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface12, eGLSurface12, EGL14.EGL_NO_CONTEXT);
                    if (eGLSurface != null) {
                        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                    }
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                    }
                    if (eGLDisplay != null) {
                        EGL14.eglTerminate(eGLDisplay);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            eGLSurface = null;
            eGLContext = null;
        } catch (Throwable th6) {
            th = th6;
            eGLSurface = null;
            eGLContext = null;
        }
    }

    @RequiresApi(api = 22)
    public static String getGPURenderer() throws Throwable {
        if (!initialized) {
            Initialize();
        }
        return glRenderer;
    }

    public static String getGPURendererFallback() {
        return glRenderer;
    }
}
