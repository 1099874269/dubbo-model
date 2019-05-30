package com.api;

import java.util.List;

public interface UserDaoApi<T> {
    List<T> selUser();
}
