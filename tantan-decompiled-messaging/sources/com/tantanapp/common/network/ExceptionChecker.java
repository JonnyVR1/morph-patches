package com.tantanapp.common.network;

import com.p046p1.mobile.putong.data.User;
import java.io.IOException;
import java.io.InputStream;
import p149l.edk0;
import p149l.exc0;

/* JADX INFO: loaded from: classes13.dex */
public class ExceptionChecker {
    private static final String TAG = "ExceptionChecker";

    public static Exception check(exc0 exc0Var) {
        if (User.ID_TEAM_ACCOUNT.equals(exc0Var.m118611u("Putong-Client-Version-Expires-At"))) {
            return new ApiExcep.ClientExpired(exc0Var);
        }
        if (edk0.f90612b && exc0Var.m118611u("X-RateLimit-Remaining") != null) {
            String str = edk0.f90611a;
        }
        int iM118609q = exc0Var.m118609q();
        int i = iM118609q / 100;
        if (i == 2) {
            return null;
        }
        if (iM118609q == 400) {
            return new ApiExcep.Client.BadRequest(exc0Var);
        }
        if (iM118609q == 401) {
            return new ApiExcep.Client.Unauthorized(exc0Var);
        }
        if (iM118609q == 403) {
            return new ApiExcep.Client.Forbidden(exc0Var);
        }
        if (iM118609q == 404) {
            return new ApiExcep.Client.NotFound(exc0Var);
        }
        if (iM118609q == 405) {
            return new ApiExcep.Client.MethodNotAllowed(exc0Var);
        }
        if (iM118609q == 409) {
            return new ApiExcep.Client.Conflict(exc0Var);
        }
        if (iM118609q == 410) {
            return new ApiExcep.Client.Gone(exc0Var);
        }
        if (iM118609q == 413) {
            return new ApiExcep.Client.RequestEntityTooLarge(exc0Var);
        }
        if (iM118609q == 415) {
            return new ApiExcep.Client.UnsupportedMediaType(exc0Var);
        }
        if (iM118609q == 418) {
            return new ApiExcep.Client.ImATeapot(exc0Var);
        }
        if (iM118609q == 422) {
            return new ApiExcep.Client.UnprocessableEntity(exc0Var);
        }
        if (iM118609q == 429) {
            String strM118611u = exc0Var.m118611u("X-RateLimit-Reset");
            return strM118611u != null ? new ApiExcep.Client.TooManyRequests(exc0Var, Math.min(Integer.parseInt(strM118611u), 10)) : new ApiExcep.Client.TooManyRequests(exc0Var, 5);
        }
        if (i == 5) {
            return new ApiExcep.Server(exc0Var);
        }
        return new Exception("code: " + iM118609q);
    }

    public static InputStream inputStreamAfterCheck(exc0 exc0Var) throws IOException {
        if (exc0Var.m118609q() != 204) {
            return exc0Var.m118606k().byteStream();
        }
        return null;
    }
}
